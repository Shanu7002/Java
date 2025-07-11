package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ativ3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for(int i = 0; i < vect.length; i++){
            vect[i] = sc.nextDouble();
        }
        System.out.println("NUMEROS NEGATIVOS: ");
        for(int i = 0; i < vect.length; i++){
            if (vect[i] < 0){
                System.out.printf("%.2f%n", vect[i]);
            }
        }


        sc.close();
    }
}
