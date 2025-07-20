package Program;

import Entities.Client;
import Entities.Order;
import Entities.OrderItem;
import Entities.Product;
import enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);

        //client data
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date date = sdf.parse(sc.nextLine());

        //add new client to the list
        Client client = new Client(name, email, date);

        //status and time data
        System.out.println("Enter order status: ");
        System.out.print("Status: ");
        String statusStr = sc.nextLine();
        Date moment = new Date();
        OrderStatus status = OrderStatus.valueOf(statusStr.toUpperCase());

        //add status and time to the list
        Order order = new Order(moment, status);

        //for to add how many products the client want to
        System.out.println("Enter order data: ");
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < n; i++){
            System.out.println("Enter #" + (i + 1) + " item data");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double price = sc.nextDouble();
            Product product = new Product(productName, price);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            order.addItem(new OrderItem(quantity, price, product));
        }

        //print the final result
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);
        System.out.println(client);
        System.out.println("Order items: ");
        for(OrderItem item : order.getItems()){
            System.out.println(item.toString());
        }
        System.out.println(order.toStringTotal());

        sc.close();
    }
}