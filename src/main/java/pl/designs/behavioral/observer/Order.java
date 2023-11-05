package pl.designs.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private String id;

    private double itemCost;

    private int count;

    private int discount;

    private final List<Observer<Order>> observers = new ArrayList<>();

    public Order(String id) {
        this.id = id;
    }


    public void attach(Observer<Order> observer) {
        observers.add(observer);
    }

    public void detach(Observer<Order> observer) {
        observers.remove(observer);
    }

    public int getDiscount() {
        return this.discount;
    }

    public int getCount() {
        return this.count;
    }

    public void addItem(double price) {
        itemCost += price;
        count++;
        observers.forEach(observer -> observer.update(this));
    }

    public double getTotalPrice() {
        return itemCost * count;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        String messageTheme = "Total price: %.2f, number of items: %d, discount amount: %d";
        return String.format(messageTheme, this.getTotalPrice(), this.getCount(), this.getDiscount());
    }
}
