package it.univr.L1;

/*
Si scriva un programma che legge n >= 1 da tastiera e stampa una piramide di altezza n. Per esempio, per n = 4 deve stampare:
   @
  @@
 @@@@
@@@@@@
 */

import java.util.Scanner;

public class Es5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do{
            System.out.println("Inserire un numero maggiore uguale a 1: ");
            num = scanner.nextInt();
        }
        while(num < 1);

        int offset = 0;
        int b = (2*num)/ (int)Math.sqrt(3);
        int k = (b/2);
        System.out.println(k);

        for(int i = 0; i <= num; i++){
            for(int j = 0; j < b; j++){
                if(j > k-offset && j < k+offset) System.out.print("*");
                else System.out.print(" ");
            }
            offset++;
            System.out.println();
        }
    }
}
