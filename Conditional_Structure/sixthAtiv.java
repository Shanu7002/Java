//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
package Conditional_Structure;

import java.util.Locale;
import java.util.Scanner;

public class sixthAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Write a number: ");
        num = sc.nextInt();

        if(num >= 0 && num < 25){
            System.out.print("[0,24]");
        } else if(num >= 25 && num < 50){
            System.out.print("[25,49]");
        } else if (num >= 50 && num < 75){
            System.out.print("[50,74]");
        } else if  (num >= 75 && num < 100){
            System.out.print("[75,99]");
        } else {
            System.out.print("Invalid number");
        }

        sc.close();
    }
}
