package it.univr.L1;

import java.util.Random;

public class Cerchio {
    public static void main(String[] args){
        Random r = new Random();
        int area = r.nextInt(); // per limitare con un massimo da me scelto posso scrivere int area = r.nextInt(100);

        // if(area < 0) area = -area;
        if(area < 0) Math.abs(area);    // altro metodo per ottenere il valore assoluto di "area"

        System.out.println(area);

        // area =  r^2 * pi
        double radius = Math.sqrt(area / Math.PI);
        System.out.println("Area = " + area + "\nRadius = " + radius);
    }
}
