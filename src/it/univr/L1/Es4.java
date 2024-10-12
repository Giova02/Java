package it.univr.L1;

/*
Si scriva un programma che stampa 26 volte la cornice 10 x 10, usando ogni
volta un carattere alfabetico diverso al posto di '@', dalla 'a' alla 'z'.
 */

public class Es4 {
    public static void main(String[] args) {
        for(int i = 'a'; i <= 'z'; i++){
            for(int j = 0; j < 10; j++) System.out.print((char)i);
            for(int j = 0; j < 8; j++){
                System.out.print("\n" + (char)i + "        " + (char)i);
            }
            System.out.println();
            for(int j = 0; j < 10; j++) System.out.print((char)i);
            System.out.println("\n");
        }
    }
}
