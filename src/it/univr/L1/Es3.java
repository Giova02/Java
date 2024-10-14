package it.univr.L1;

/*
Si scriva un programma che stampa, una dopo l'altra, nove cornici, da quella 2 x 2 a quella 10 x 10.
 */

public class Es3 {
    public static void main(String[] args) {
        for(int i = 2; i < 11; i++){
            for(int j = 0; j < i; j++) System.out.print("@");
            for(int j = 0; j < i-2; j++){
                System.out.print("\n@");
                for(int k = 0; k < i-2; k++){
                    System.out.print(" ");
                }
                System.out.print("@");
            }
            System.out.println();
            for(int j = 0; j < i; j++) System.out.print("@");
            System.out.println("\n");
        }
    }
}
