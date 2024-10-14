package it.univr.esercizi;

import java.util.Random;

public class BrumBrumRace {
    public static void main(String[] args) {
        String output = "";
        System.out.println("Brum Brum Race Nigger :D");

        int p1 = 0;
        int p2 = 0;

        Random random = new Random();

        while(p1 <= 20 && p2 <= 20){
            output += "-----------------------------------------------------------------------------------------------";
            output += "-----------------------------------------------------------------------------------------------";
            output += "----------------------------------------------------------------------------";
            output += "----------------------------------------------------------------------------";
            output += "----------------------------------------------------------------------------";
            output += "----------------------------------------------------------------------------";
            output += "----------------------------------------------------------------------------";
            p1 += random.nextInt(0, 2);
            p2 += random.nextInt(0, 2);
            System.out.println(output);
            output = "";
        }

        if(p1 > p2){
            System.out.println("Hai vinto (PORCODIOBASTARDO)");
        }
        else{
            System.out.println("Hai perso (GODO PORCODIOBASTARDO)");
        }
    }
}
