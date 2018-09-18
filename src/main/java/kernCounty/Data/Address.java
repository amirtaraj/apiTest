package kernCounty.Data;

import java.util.Random;

public interface Address {

    String CountryName = "UNITED STATES";

     static String addressLine () {

         String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         StringBuilder salt = new StringBuilder();
         Random rnd = new Random();
         while (salt.length() < 18) { // length of the random string.
             int index = (int) (rnd.nextFloat() * SALTCHARS.length());
             salt.append(SALTCHARS.charAt(index));
         }
         String saltStr = salt.toString();
         return saltStr;

     }





}
