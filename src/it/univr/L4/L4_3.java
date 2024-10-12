package it.univr.L4;

/*
Si scriva un programma Java che legge una frase da tastiera
e determina se tale frase è palindroma
 */

import java.util.Scanner;

public class L4_3 {
    public static void main(String[] args) {
        System.out.print("inserisci una stringa: ");

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        boolean palindrome = true;

        for (int i = 0; i < string.length() / 2; i++) {
            if(string.charAt(i) != string.charAt(string.length() - i - 1)) palindrome = false;
        }

        if(palindrome){
            System.out.println("è palindromo");
        }
        else{
            System.out.println("non è palindromo");
        }
    }
}
