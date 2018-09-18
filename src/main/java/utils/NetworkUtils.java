package utils;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

import javax.naming.ServiceUnavailableException;
import java.net.MalformedURLException;
import java.util.*;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class NetworkUtils  {

    public static void main(String args[]) throws ServiceUnavailableException {

        String token = getToken();
        System.out.println(token);

    }

    private static String url;

    @Autowired
    private Environment env;

    public static String token;

    public static String getToken () throws ServiceUnavailableException {
        AuthenticationContext authContext;
        String result = null;
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(1);
            String url = "https://login.microsoftonline.com/" + Constants.tenantId + "/oauth2/authorize";
            authContext = new AuthenticationContext(url,
                    false,
                    service);
            ClientCredential clientCred = new ClientCredential(Constants.CLIENT_ID, Constants.password);
            Future<AuthenticationResult> future = authContext.acquireToken(
                   Constants.CLIENT_ID,
                    clientCred,
                    null);

            result = future.get().getAccessToken();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } finally {
            service.shutdown();
        }

        if (result == null) {
            throw new ServiceUnavailableException(
                    "authentication result was null");
        }
        return result;
    }

}
