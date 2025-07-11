//Fazer um programa para ler um número inteiro N e a altura de N pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a altura média dessas pessoas
package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ativ1 {
    public void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double sum = 0;
        int n = sc.nextInt();
        double[] vect = new double[n];
        for(int i = 0; i < n; i++){
            vect[i] = sc.nextInt();
            sum += vect[i];
        }

        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f", avg);


        sc.close();
    }

}
