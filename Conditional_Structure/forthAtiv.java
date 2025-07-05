//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
package Conditional_Structure;

import java.util.Scanner;

public class forthAtiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialNum, finalNum, result = 0;

        System.out.print("Enter the initial time: ");
        initialNum = sc.nextInt();
        System.out.print("Enter the final time: ");
        finalNum = sc.nextInt();

        if (initialNum == finalNum) {
            result = 24;
        } else if (initialNum < finalNum) {
            result = finalNum - initialNum;
        } else {
            result = (24 - initialNum) + finalNum;
        }

        System.out.printf("The result is: %d", result);
            sc.close();

    }
}
