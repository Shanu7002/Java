//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.
package Sequencial_Structure;
import java.util.Locale;
import java.util.Scanner;

public class sixthAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float A, B, C;
        System.out.print("Enter the first number: ");
        A = sc.nextFloat();
        System.out.print("Enter the second number: ");
        B = sc.nextFloat();
        System.out.print("Enter the third number: ");
        C = sc.nextFloat();

        double triangle, circle, trapezoid, square, rectangle, pi = 3.1415;

        triangle = A * C / 2;
        circle = pi * (C * C);
        trapezoid = (A + B) / 2 * C;
        square = B * B;
        rectangle = A * B;

        System.out.printf("The triangle is: %.3f\n", triangle);
        System.out.printf("The circle is: %.3f\n", circle);
        System.out.printf("The trapezoid is: %.3f\n", trapezoid);
        System.out.printf("The square is: %.3f\n", square);
        System.out.printf("The rectangle is: %.3f\n", rectangle);

        sc.close();
    }
}
