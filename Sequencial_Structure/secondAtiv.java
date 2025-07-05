//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.
package Sequencial_Structure;
import java.util.Scanner;

public class secondAtiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, pi = 3.14159, formulaArea;

        System.out.print("Write the radius: ");
        radius = sc.nextDouble();

        formulaArea = pi * (radius * radius);

        System.out.printf("The area of the circle is: %.4f.%n", formulaArea);
        sc.close();
    }
}
