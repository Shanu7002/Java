package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ativ7 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int posicaoMaiorNum = 1;
        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        double[] num = new double[n];
        double maiorNum = num[0];
        for(int i = 0; i < num.length; i++){
            System.out.print("Digite um numero: ");
            num[i] = sc.nextDouble();
            if(num[i] >= maiorNum){
                maiorNum = num[i];
                posicaoMaiorNum = i;
            }
        }

        System.out.println("MAIOR VALOR = " + maiorNum);
        System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorNum);



        sc.close();
    }
}
