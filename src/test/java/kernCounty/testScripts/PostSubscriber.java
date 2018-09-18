package kernCounty.testScripts;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import kernCounty.Data.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;
import pojo.*;
import utils.Constants;
import utils.NetworkUtils;
import utils.Service;

import javax.naming.ServiceUnavailableException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.filters;
import static io.restassured.RestAssured.given;

public class PostSubscriber {

    @Test
    public void enrollNewSubscriber () throws ServiceUnavailableException {
        List<MemberAddress> memberAddresses = new ArrayList<>();
        memberAddresses.add(new MemberAddress(
                false,1,true,273, Address.CountryName,
                Address.addressLine(), ZipCode.losAngelas,
                "LOS ANGELES","CA"

        ));

        Member member = new Member(
                false,false,false,false,false,false,false,false,
                false,false,false,false,false,memberAddresses,
                SSN.getSSN(), ClientID.clientID1, PersonalData.name(),
                PersonalData.name(),PersonalData.middelInitial(), "12/12/1945",1
        );

        RelationTypes relationTypes = new RelationTypes(
                "SUBSCRIBER"

        );

        List<SubscriptionMemberPlans> subscriptionMemberPlans = new ArrayList<>();
        subscriptionMemberPlans.add(new SubscriptionMemberPlans(
                false,true,false,false,false,false,
                ClientPlanID.clientPlanID1,"DEN",
                "DD UNLIMITED","ESC","N","2018-09-01T10:55:43.828Z"
        ));

        List<SubscriptionMembers> subscriptionMembers = new ArrayList<>();
        subscriptionMembers.add(new SubscriptionMembers(
                true,false,false,false,false,false,null,false,
                false,false,false,false,false,false,false,false,false,
                member,subscriptionMemberPlans,relationTypes,
                0,false,true,null,true,"2018-09-01T10:55:43.828Z",true,true
        ));

        Subscriber subscriber = new Subscriber(
                subscriptionMembers,false,ClientID.clientID1,true

        );

        Gson gson = new Gson();
        String json =gson.toJson(subscriber);
        System.out.println(json);


        RestAssured.baseURI = Constants.SUSBCRIPTION_ADD;
        given().auth().oauth2(NetworkUtils.getToken()).header("Content-Type","application/json")
                .body(subscriber)
                .post().then().log().headers().statusCode(200).log().body();



    }
}
