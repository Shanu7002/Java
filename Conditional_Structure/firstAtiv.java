//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
package Conditional_Structure;
import java.util.Scanner;

public class firstAtiv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Write a number: ");
        num1 = sc.nextInt();
        if (num1 > 0){
            System.out.print("Positive");
        } else if (num1 < 0){
            System.out.print("Negative");
        } else {
            System.out.print("Zero");
        }

        sc.close();
    }
}
