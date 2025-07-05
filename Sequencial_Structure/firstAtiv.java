// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa
package Sequencial_Structure;

import java.util.Scanner;

public class firstAtiv {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int num1, num2, sum;

        System.out.printf("Write the first number: ");
        num1 = sc.nextInt();
        System.out.printf("Write the second number: ");
        num2 = sc.nextInt();

        sum = num1 + num2;
        System.out.println("The sum is: " + sum);

        sc.close();
    }
}