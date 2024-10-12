package it.univr.L4;

/*
Si scriva un programma il cui main legge un intero non negativo da tastiera (se negativo, lo richiede ad oltranza)
e lo trasforma in una stringa che rappresenta lo stesso numero in binario, che infine stampa. Per esempio, se viene
immesso l'intero 123, deve costruire e poi stampare la stringa "1111011"
 */

import java.util.Scanner;

public class L4_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        String result = "";
        do{
            System.out.println("Inserisci un numero non negativo: ");
            n = scanner.nextInt();
        }
        while(n < 0);

        int dim = 1;
        while(dim < n){
            dim *= 2;
        }
        dim /= 2;

        while(n > 0){
            if(dim > n){
                result = result + "0";
            }
            else{
                n -= dim;
                result = result + "1";
            }
            dim /= 2;
        }

        System.out.println(result);
    }
}
