//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
package Sequencial_Structure;
import java.util.Scanner;

public class thirdAtiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, C, D, diference;

        System.out.print("Enter the first number: ");
        A = sc.nextInt();
        System.out.print("Enter the second number: ");
        B = sc.nextInt();
        System.out.print("Enter the third number: ");
        C = sc.nextInt();
        System.out.print("Enter the fourth number: ");
        D = sc.nextInt();

        diference = A * B - C * D;

        System.out.printf("The difference is: %d",  diference);

    sc.close();
    }
}
