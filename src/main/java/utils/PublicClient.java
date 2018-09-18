package utils;

import com.microsoft.aad.adal4j.AuthenticationContext;
import com.microsoft.aad.adal4j.AuthenticationResult;
import com.microsoft.aad.adal4j.ClientCredential;

import javax.naming.ServiceUnavailableException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class PublicClient {

    static String tenantId = "hear2dev.onmicrosoft.com";
    private final static String AUTHORITY = "https://login.microsoftonline.com/"+ tenantId + "/oauth2/authorize";
    private final static String CLIENT_ID = "5aee5cea-5e78-4a22-8cb1-5eaf64a16f3a";
    static String password = "gUNQJvWe2Fd1hkDvZbkQdUlCVwT3ouVM+kLeE03Tq9o=";

    public static void main(String args[]) throws Exception {

            // Request access utils from AAD
            String result = getAccessTokenFromUserCredentials();
            System.out.println("------utils------");
           System.out.print(result);
        }


    private static String getAccessTokenFromUserCredentials() throws Exception {
        AuthenticationContext authContext;
        String result;
        ExecutorService service = null;
        try {
            service = Executors.newFixedThreadPool(1);
            String url = "https://login.microsoftonline.com/" + tenantId + "/oauth2/authorize";
            authContext = new AuthenticationContext(url,
                    false,
                    service);
            ClientCredential clientCred = new ClientCredential(CLIENT_ID, password);
            Future<AuthenticationResult>  future = authContext.acquireToken(
                    CLIENT_ID,
                    clientCred,
                    null);

            result = future.get().getAccessToken();
        } finally {
            service.shutdown();
        }

        if (result == null) {
            throw new ServiceUnavailableException(
                    "authentication result was null");
        }
        return result;
    }

    private static String getUserInfoFromGraph(String accessToken) throws IOException {

        URL url = new URL("https://graph.microsoft.com/v1.0/me");
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

        conn.setRequestMethod("GET");
        conn.setRequestProperty("Authorization", "Bearer " + accessToken);
        conn.setRequestProperty("Accept","application/json");

        int httpResponseCode = conn.getResponseCode();
        if(httpResponseCode == 200) {
            BufferedReader in = null;
            StringBuilder response;
            try{
                in = new BufferedReader(
                        new InputStreamReader(conn.getInputStream()));
                String inputLine;
                response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
            } finally {
                in.close();
            }
            return response.toString();
        } else {
            return String.format("Connection returned HTTP code: %s with message: %s",
                    httpResponseCode, conn.getResponseMessage());
        }
    }
}

