package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ativ4 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0.0;
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }
        System.out.print("VALROES = ");
        for(int i = 0; i < vect.length; i++){
            System.out.print(" " + vect[i] + " ");
            sum += vect[i];
            if( i == vect.length - 1){
                sc.nextLine();
                System.out.println("\nSOMA = " + sum);
            }
        }
        double media = sum / vect.length;
        System.out.println("MEDIA = " + media);


        sc.close();
    }
}


