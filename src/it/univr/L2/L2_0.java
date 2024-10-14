package it.univr.L2;

public class L2_0 {
    public static void main(String[] args) {
        Date d1 = new Date(9, 10, 2024);

        // i campi valgono 0 di default

        // commentati perchè, per incapsulazione, preferiamo
        // che ogni classe si gestisca automaticamente i propri
        // campi attraverso il costruttore

            //d1.day = 9;
            //d1.month = 10;
            //d1.year = 2024;

        System.out.println(d1.getDay() + ":" + d1.getMonth() + ":" + d1.getYear());

        System.out.println(d1);
    }
}
