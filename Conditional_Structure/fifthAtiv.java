//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.
package Conditional_Structure;

import java.util.Locale;
import java.util.Scanner;

public class fifthAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int item, quantity;
        double value, finalValue = 0;

        System.out.print("Select the item (1-5):");
        item = sc.nextInt();
        System.out.print("Select the quantity: ");
        quantity = sc.nextInt();

        if (item == 1){
            value = 4.00;
            finalValue = value * quantity;
        } else if (item == 2){
            value = 4.50;
            finalValue = value * quantity;
        } else if(item == 3){
            value = 5.00;
            finalValue = value * quantity;
        } else if(item == 4){
            value = 2.00;
            finalValue = value * quantity;
        } else if(item == 5){
            value = 1.50;
            finalValue = value * quantity;
        }
        System.out.printf("The final price is: %.2f", finalValue);

        sc.close();
    }
}
