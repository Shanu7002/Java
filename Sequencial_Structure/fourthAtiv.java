//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.
package Sequencial_Structure;
import java.util.Locale;
import java.util.Scanner;

public class fourthAtiv {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int num, hours;
        float salaryHour, salary;

        System.out.print("Whats your number? ");
        num = sc.nextInt();
        System.out.print("How much hours do you work per month? ");
        hours = sc.nextInt();
        System.out.print("How much do you gain per hour?");
        salaryHour = sc.nextFloat();
        salary = salaryHour * hours;

        System.out.printf("You number is %d and gain %.2f per month%n", num, salary);

        sc.close();
    }
}
