package it.univr.L4;

/*
Si faccia la stessa cosa in ottale e in esadecimale.
 */
import java.util.Scanner;

public class L4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2;
        String result = "";
        do{
            System.out.println("Inserisci un numero non negativo: ");
            n1 = n2 = scanner.nextInt();
        }
        while(n1 < 0);

        while(n1 > 0){
             result += "" + n1 % 8;
             n1 /= 8;
        }
        System.out.print("Oct = ");

        for(int i = result.length() - 1; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
        System.out.println();
        result = "";

        char Hex[] = { 'A', 'B', 'C', 'D', 'E', 'F'};

        while(n2 > 0){
            if(n2 % 16 > 9){
                result += "" + Hex[(n2 % 16) - 10];
            }
            else{
                result += n2 % 16;
            }
            n2 /= 16;
        }
        System.out.print("Hex = ");
        for(int i = result.length() - 1; i >= 0; i--){
            System.out.print(result.charAt(i));
        }
    }
}
