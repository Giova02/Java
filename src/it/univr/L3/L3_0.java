package it.univr.L3;

import java.util.Random;

public class L3_0 {
    public static void main(String[] args) {
        // Date date = new Date(10, 10, 2024);
        Random random = new Random();
        Date date = new Date(   // creato con costruttore 1
                random.nextInt(1, 31),
                random.nextInt(1, 12),
                random.nextInt(1945, 2024)
        );

        Date thisYear = new Date( // giorno di questo anno con costruttore 2
                random.nextInt(1, 31),
                random.nextInt(1, 12)
        );

        Date xmas = new Date(); // natale 2024 con costruttore 3

        date.setAmerican();
        thisYear.setAmerican();
        xmas.setAmerican();

        System.out.println("US: " + date);
        System.out.println("US: " + thisYear);
        System.out.println("US: " + xmas + '\n');

        date.setItalian();
        thisYear.setItalian();
        xmas.setItalian();

        System.out.println("IT: " + date);
        System.out.println("IT: " + thisYear);
        System.out.println("IT: " + xmas);
    }
}
