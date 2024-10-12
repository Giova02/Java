package it.univr.L1;

/*
Si scriva un programma Java che legge un intero non negativo n da tastiera e stampa una cornice n x n:
@@@@@
@    @
@    @
@    @
@    @
@@@@@
 */

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do{
            System.out.println("Dammi un numero non negativo: ");
            n = scanner.nextInt();
        }
        while(n < 0);

        for(int i = 0; i < n; i++) System.out.print("@");
        for(int i = 0; i < n-2; i++){
            System.out.print("\n@");
            for(int j = 0; j < n-2; j++){
                System.out.print(" ");
            }
            System.out.print("@");
        }
        System.out.println();
        for(int i = 0; i < n; i++) System.out.print("@");
    }
}
