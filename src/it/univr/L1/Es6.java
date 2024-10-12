package it.univr.L1;

/*
Si faccia la stessa cosa del punto precedente, ma stampando la piramide orizzontalmente:
   @
  @@
 @@
@@@
 @@
  @@
   @
 */

import java.util.Scanner;

public class Es6 {
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

        for(int i = 0; i < b-1; i++){
            for(int j = 0; j < num; j++){
                if(i > k-offset) System.out.print("*");
                else System.out.print(" ");
            }
            offset++;
            System.out.println();
        }
    }
}
