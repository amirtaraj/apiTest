package utils;

import com.google.gson.Gson;
import kernCounty.Data.*;
import pojo.*;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

public class Service {


    public static void main(String args[]) {

        System.out.println("SCENARIO : enrolling a new subscriber without a dependent");
        enrollSubcriber();

    }

    public static void enrollSubcriber() {

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
                false,true,true,false,false,false,
                ClientPlanID.clientPlanID1,"HLTH",
                "80-M $40","ESC","N","2018-09-01T10:55:43.828Z"
        ));
        subscriptionMemberPlans.add(new SubscriptionMemberPlans(
                false,true,true,false,false,false,
                ClientPlanID.clientPlanID2,"DEN",
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
    }
}
