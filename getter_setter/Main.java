package getter_setter;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter account holder: ");
        String name = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)? ");
        String initialDeposit = sc.nextLine();

        Account account;

        if (initialDeposit.equalsIgnoreCase("y")){
            System.out.print("Enter initial deposit value: ");
            double depositValue = sc.nextDouble();

            account = new Account(depositValue, number, name);
        }else if(initialDeposit.equalsIgnoreCase("n")){
            account = new Account(number, name);
        } else {
            System.out.print("Invalid answer.");
            sc.close();
            return;
        }

        System.out.println("Account data:\n" + account);


        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.setMoneyDeposit(depositValue);

        System.out.println("Updated account data:\n" + account);


        System.out.print("Enter a withdraw value: ");
        depositValue = sc.nextDouble();
        account.setMoneyWithdrawal(depositValue);

        System.out.print("Updated account data:\n" + account);

        sc.close();
    }
}
