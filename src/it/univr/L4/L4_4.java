package it.univr.L4;

import it.univr.L3.Date;

import java.util.Random;

public class L4_4 {
    public static void main(String[] args) {
        // Date date = new Date(10, 10, 2024);
        Random random = new Random();
        it.univr.L3.Date date = new it.univr.L3.Date(   // creato con costruttore 1
                random.nextInt(1, 31),
                random.nextInt(1, 12),
                random.nextInt(1945, 2024)
        );

        it.univr.L3.Date thisYear = new it.univr.L3.Date( // giorno di questo anno con costruttore 2
                random.nextInt(1, 31),
                random.nextInt(1, 12)
        );

        it.univr.L3.Date xmas = new Date(); // natale 2024 con costruttore 3

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
        System.out.println("IT: " + xmas + '\n');

        // confronto tra i puntatori degli oggetti (da sempre "false" perchè i puntatori all'oggetto sono sempre diversi)
        System.out.println("xmas = date ? " + (xmas == date));

        // usando invece il nuovo metodo "equals" funziona
        System.out.println("xmas = date ? " + xmas.equals(date));
    }
}
