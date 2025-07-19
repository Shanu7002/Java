package Program;

import Entities.Client;
import Entities.Order;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        //dados do cliente
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String birthDate = sc.nextLine();
        Date date = sdf.parse(birthDate);

        //inicializa o cliente
        Client client = new Client(name, email, date);

        System.out.println("Enter order status: ");
        System.out.print("Status: ");
        String statusStr = sc.nextLine();
        Date moment = new Date();
        OrderStatus status = OrderStatus.valueOf(statusStr);

        Order order = new Order(moment, status);

        System.out.println(order);




        sc.close();
    }
}