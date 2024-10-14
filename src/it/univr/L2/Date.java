package it.univr.L2;

public class Date {

    // campi degli oggetti di classe Date (fields)
    // di default valgono 0

    // attraverso "private" le variabile sono incapsulate nella classe
    // le variabili non sono accessibili fuori dalla classe
    private int day;
    private int month;
    private int year;

    // costruttore (deve avere lo stesso nome della classe)
    public Date(int day, int month, int year) {

        // assegna i parametri del costruttore ai campi dell'oggetto
        // "this" contiene il puntatore all'oggetto che si sta inizializzando
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // metodi della classe Date
    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    // metodo toString personalizzato
    public String toString() {
        // posso anche non scrivere "this", che viene considerato sottinteso
        return this.day + ":" + this.month + ":" + this.year;
    }
}
