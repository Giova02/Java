package it.univr.L4;

public class Date {

    // campi degli oggetti di classe Date (fields)
    // di default valgono 0

    // attraverso "private" le variabile sono incapsulate nella classe
    // le variabili non sono accessibili fuori dalla classe
    private final int day;
    private final int month;
    private final int year;
    private Language lang = Language.ITALIAN;

    // dichiaro un array di stringhe di dimensione definita dal numero di elementi
    // "static" indica che questo campo è condiviso da tra ogni oggetto date
    private static String[] monthsIT = {
            "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio",
            "agosto", "settembre", "ottobre", "novembre", "dicembre"
    };
    private static String[] monthsUS = {
            "January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "Dicember"
    };


    // costruttore 1 (deve avere lo stesso nome della classe)
    public Date(int day, int month, int year) {

        // assegna i parametri del costruttore ai campi dell'oggetto
        // "this" contiene il puntatore all'oggetto che si sta inizializzando
        this.day = day;
        this.month = month;
        this.year = year;
        verify();
    }

    // costruttore 2 (versione con anno di valore predefinito costante)
    // avendo molteplici costruttori posso avere modi diversi per costruire l'oggetto
    public Date(int day, int month) {
        /*
        this.day = day;
        this.month = month;
        this.year = 2024;
         */
        this(day, month, 2024);
        verify();
    }

    // costruttore 3 (versione con un giorno ben preciso) (Natale 2024)
    public Date() {
        /*
        this.day = 25;
        this.month = 12;
        this.year = 2024;
         */
        this(25, 12);
    }

    private void verify(){
        if(month < 1 || month > 12 || day > daysInMonth()){
            System.out.println("Invalid month");
        }
    }

    private static int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    private int daysInMonth() {
        if (month == 2 && isLeapYear()){
            return 29;
        }
        return daysInMonth[month - 1];
    }

    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
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

    public void setItalian(){
        this.lang = Language.ITALIAN;
    }
    public void setAmerican(){
        this.lang = Language.AMERICAN;
    }

    // Confronto tra 2 oggetti Date
    public boolean equals(Date other){
        if(this.day == other.day &&
                this.month == other.month &&
                this.year == other.year
        ){
            return true;
        }
        return false;
    }
    /*
    // commentato perchè, essendo le varibaili costanti ("final")
    // non è possibile modificarle attraverso metodi
    public void setDay(int day){
        this.day = day;
    }
    public void setMonth(int month){
        this.month = month;
    }
    public void setYear(int year){
        this.year = year;
    }
    */

    // metodo toString personalizzato
    public String toString() {

        /*
        // Spostato nella zona di inizializzazione delle variabili "private"
        // Per evitare molteplici allocazioni ad ogni chiamata di metodo "toString"
        private String[] months = {
                "gennaio", "febbraio", "marzo", "aprile", "maggio", "giugno", "luglio",
                "agosto", "settembre", "ottobre", "novembre", "dicembre"
        };
         */

        if(lang == Language.AMERICAN){
            return monthsUS[month - 1] + " " + day + " " + year;
        }
        else{
            return day + " " + monthsIT[month - 1] + " " + year;
        }

        // posso anche non scrivere "this", che viene considerato sottinteso
        // return this.day + ":" + this.month + ":" + this.year;
    }
}
