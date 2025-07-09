package Ativ4;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double dollarPrice =  sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double dollarAmmount =  sc.nextDouble();

        double cotacao = CurrencyConverter.cotacao(dollarPrice, dollarAmmount);
        double reaisIOF = CurrencyConverter.reaisIOF(cotacao);

        System.out.printf(String.format("Amount to be paid in reais = %.2f", reaisIOF));


        sc.close();
    }
}
