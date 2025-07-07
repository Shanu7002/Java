//Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário ( nome e salário líquido).
//Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar novamente os dados do funcionário.
//Use classe.
package Ativ2;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        product people = new product();

        System.out.println("Enter your name, gross salary and tax: ");
        people.name = sc.nextLine();
        people.GrossSalary = sc.nextDouble();
        people.Tax = sc.nextDouble();

        System.out.println("Employee: " + people);

        System.out.println("Which percentage to increase salary? ");
        people.IncreaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + people);

    }
}
