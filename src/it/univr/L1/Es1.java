package it.univr.L1;

/*
Si scriva un programma che legge da tastiera un long non negativo n e lo richiede a oltranza se l'utente
lo inserisse negativo. Quindi genera n coppie (x,y) fatte da due numeri casuali di tipo double, fra -1 e 1.
Per ogni coppia controlla se la coordinata (x,y) sta dentro il cerchio di raggio 1 centrato sull'origine
degli assi e in tal caso incrementa una variabile dentro di tipo long. Alla fine stampa il valore della
formula dentro * 4 / n senza perdere le cifre che seguono la virgola.
 */

import java.util.Random;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num;
        do{
            System.out.println("inserire un numero non negativo:");
            num = scanner.nextLong();
        }
        while(num < 0);

        Random random = new Random();
        long dentro = 0;

        for(int i = 0; i < num; i++){
            double x = random.nextDouble(-1, 1);
            double y = random.nextDouble(-1, 1);

            if(x*x + y*y <= 1){
                dentro++;
            }
        }
        System.out.println("Il valore finale è = " + ((double)dentro*(double)4/(double)num));
    }
}
