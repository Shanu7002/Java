package Arrays;

import java.util.Locale;
import java.util.Scanner;

public class Ativ6 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        int[] quantidade = new int[n];
        int quantidadesPares = 0;

        for(int i = 0; i < quantidade.length; i++){
            System.out.print("Digite um numero: ");
            quantidade[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");
        for(int i = 0; i < quantidade.length; i++){
            if(quantidade[i] % 2 == 0){
                System.out.print(quantidade[i] + " ");
                quantidadesPares += 1;
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + quantidadesPares);


        sc.close();
    }
}
