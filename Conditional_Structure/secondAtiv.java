//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
package Conditional_Structure;
import java.util.Scanner;

public class secondAtiv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1;
        System.out.print("Write a number: ");
        num1 = sc.nextInt();

        if (num1 % 2 == 0){
            System.out.print("Even");
        } else {
            System.out.print("Odd");
        }

        sc.close();
    }
}
