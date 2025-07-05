//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.
package Conditional_Structure;

import java.util.Locale;
import java.util.Scanner;

public class seventhAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double X, Y;

        System.out.print("Enter X: ");
        X = sc.nextDouble();
        System.out.print("Enter Y: ");
        Y = sc.nextDouble();

            if(X == 0 && Y == 0) {
            System.out.print("Origin");
            }  else if (X > 0 && Y > 0) {
            System.out.print("Q1");
            } else if (X < 0 && Y > 0) {
            System.out.print("Q2");
            } else if (X > 0 && Y < 0) {
            System.out.print("Q4");
            } else {
            System.out.print("Q3");
            }

        sc.close();
    }

}
