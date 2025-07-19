package Entities;

import enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    public List<OrderItem> Items = new ArrayList<>();

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

    public void addItem(OrderItem item) {
        Items.add(item);
    }

    public void removeItem(OrderItem item) {
        Items.remove(item);
    }

    Double total;

    public Double getTotal() {
        for(OrderItem c : Items){
            total += c.getSubTotal();
        }
        return total;
    }

    public String toString(){
        return "Order moment: " + moment.toString() + "\n Order status: " + status.toString();
    }
}
