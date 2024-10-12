package it.univr.L1;

import java.util.Random;
import java.util.Scanner;

public class L1_1 {
    public static void main(String[] args) {
        int n;
        n = 1024;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String s = "ciao";

        // Scanner scanner2 = null;        // queste due righe contengo un Segmentation Fault
        // int y = scanner2.nextInt();     // che avviene while runnning

        System.out.println(n);
        System.out.println(s);
        System.out.println(scanner);
        System.out.println(random);
        // System.out.println(scanner.toString());  // il  metodo toString() è un metodo personale per
        // System.out.println(random.toString());   // decidere cosa stampare in casi come questo.
                                                    // Viene chiamato implicitamente anche durante una concatenazione

    }
}
