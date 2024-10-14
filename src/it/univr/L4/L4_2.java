package it.univr.L4;

/*
Si faccia la stessa cosa in Base58, che è una numerazione le cui cifre sono le cifre
arabe da 1 a 9, seguite dalle lettere alfabetiche maiuscole (tranne O e I) e poi dalle
lettere alfabetiche minuscole (tranne la l).
 */

import java.util.Scanner;

public class L4_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        char[] base58 = {
                '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        int n;
        String result = "";

        do{
            System.out.print("Inserisci un numero da convertire in Base58 (non negativo): ");
            n = scanner.nextInt();
        }
        while(n < 0);

        while(n > 0){
            result += base58[n % 58];
            n /= 58;
        }

        System.out.print("Base58 = ");

        for(int i = result.length() - 1; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
    }
}
