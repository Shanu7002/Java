//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
package Sequencial_Structure;
import java.util.Locale;
import java.util.Scanner;

public class fifthAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod1, num1, cod2, num2;
        float price1, price2, finalPrice;

        System.out.print("Enter the product code, how many do you want and the price, in order: ");
        cod1 = sc.nextInt();
        num1 = sc.nextInt();
        price1 = sc.nextFloat();

        System.out.print("Same with the second product please: ");
        cod2 = sc.nextInt();
        num2 = sc.nextInt();
        price2 = sc.nextFloat();

        finalPrice = price1 * num1  + price2 * num2;
        System.out.printf("The final price is: %.2f", finalPrice);

        sc.close();
    }
}
