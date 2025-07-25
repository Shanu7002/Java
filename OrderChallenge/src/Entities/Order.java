package Entities;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private final List<OrderItem> Items = new ArrayList<>();

    private static final SimpleDateFormat sdfWithTime = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return Items;
    }
    public void addItem(OrderItem item) {
        Items.add(item);
    }

    public void removeItem(OrderItem item) {
        Items.remove(item);
    }

    public Double getTotal() {
        double total = 0.0;
        for(OrderItem c : Items){
            total += c.getSubTotal();
        }
        return total;
    }

    public String toString(){
        String statusFormated = status.toString().substring(0, 1).toUpperCase() + status.toString().substring(1).toLowerCase();
        return "Order moment: " + sdfWithTime.format(moment) + "\nOrder status: " + statusFormated;
    }
    public String toStringTotal(){
        return String.format("Total price: $%.2f", getTotal());
    }
}
