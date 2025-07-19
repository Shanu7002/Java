package Entities;

import java.util.ArrayList;
import java.util.List;

public class OrderItem {
    private Integer quantity;
    private Double price;

    public List<Product> product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, List<Product> product) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSubTotal() {
        return price * quantity;
    }
    public List<Product> getProduct() {
        return product;
    }
    public void addProduct(Product product) {
        this.product.add(product);
    }
    public void removeProduct(Product product) {
        this.product.remove(product);
    }

    public String toString() {
        return getProduct() + ", Quantity: " + quantity + ", Subtotal: " + getSubTotal();
    }
}
