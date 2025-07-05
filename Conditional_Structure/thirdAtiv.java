//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.
package Conditional_Structure;

import java.util.Scanner;

public class thirdAtiv {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        num2 = sc.nextInt();

        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.print("It is multiple");
        } else {
            System.out.print("It is not multiple");
        }

        sc.close();
    }
}
