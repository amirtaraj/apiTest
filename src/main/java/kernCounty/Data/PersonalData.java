package kernCounty.Data;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.Random;

public class PersonalData {

    public static  void main(String args[]) throws ParseException {

        String print = name();
        System.out.println(print);

        String middleInitial = middelInitial();
        System.out.println(middleInitial);


    }

    public static String name() {

        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 6) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

    public static String middelInitial () {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 1) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;


    }

    public static String dateOfBirth()  {
        Random random = new Random();
        int minDay = (int) LocalDate.of(1940, 1, 1).toEpochDay();
        int maxDay = (int) LocalDate.of(2018, 1, 1).toEpochDay();
        long randomDay = minDay + random.nextInt(maxDay - minDay);

        LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
        return dateOfBirth();

    }


}
