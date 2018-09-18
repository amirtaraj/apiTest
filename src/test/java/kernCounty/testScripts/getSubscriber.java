package kernCounty.testScripts;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import kernCounty.Data.*;
import org.testng.annotations.Test;
import utils.Constants;
import utils.NetworkUtils;
import javax.naming.ServiceUnavailableException;
import static io.restassured.RestAssured.given;
public class getSubscriber {


    @Test
    public void getSubscriber ()  throws ServiceUnavailableException   {
        RestAssured.baseURI = Constants.SSN_URI;
        given().auth().oauth2(NetworkUtils.getToken()).
        when()
                .get(SSN.getSSN())
                .then().log().body();
    }

    @Test
    public void getMasterData () throws ServiceUnavailableException {
        RestAssured.baseURI = Constants.SUBSCRIPTION_URI;
        given().auth().oauth2(NetworkUtils.getToken())
                .when().get("/MasterData")
                .then().log().body().log().status();
    }

    @Test()
    public void getZipCode ()  throws ServiceUnavailableException  {
        RestAssured.baseURI= Constants.ZIPCODE_URI;
        given().auth().oauth2(NetworkUtils.getToken()).
        when().get(String.valueOf(ZipCode.losAngelas))
                .then().log().all();
    }

    @Test
    public void getClient () throws ServiceUnavailableException {
        RestAssured.baseURI = Constants.CLIENT_RESULT;
        given().auth().oauth2(NetworkUtils.getToken())
                .when().get(String.valueOf(ClientID.clientID4))
                .then().log().body();

    }

    @Test
    public void getClientPlanID() throws ServiceUnavailableException {
        RestAssured.baseURI = Constants.CLIENT_RESULT;
        Response response = given().auth().oauth2(NetworkUtils.getToken())
                .when().get(String.valueOf(ClientID.clientID5));
        JsonPath jsonPath = response.jsonPath();
        String clientPlanId = jsonPath.get("Products[0].Plans[1].ClientPlanID");
        System.out.println(clientPlanId);
    }

}
