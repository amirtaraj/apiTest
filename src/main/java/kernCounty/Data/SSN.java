package kernCounty.Data;

import java.util.Random;

public interface SSN {

    static void main(String args[]) {


    String SSN = getSSN();
        System.out.println(SSN);
        String databaseSSN = getdatabaseSSN();



}

     static String getSSN() {

        Random randomNum = new Random();
        int min = 000000000;
        int max = 999999999;
        int result = randomNum.nextInt(max-min ) + min;
        return String.valueOf(result);
    }

    static String getdatabaseSSN () {
        String dataBaseSSN = "324546545";
        return dataBaseSSN;


    }


}
