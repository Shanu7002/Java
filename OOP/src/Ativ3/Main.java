package Ativ3;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        Product grade = new Product();

        System.out.print("Enter your grade: ");
        grade.first = sc.nextDouble();
        grade.second = sc.nextDouble();
        grade.third = sc.nextDouble();

        System.out.println(grade);

        sc.close();
    }
}
