package com.oleynik.interviewtraining.lesson3.homework.item;

import com.oleynik.interviewtraining.lesson3.homework.rectangle.Rectangle;

public class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void sell(int amount) {
        if (quantity >= amount) {
            quantity -= amount;
        } else {
            throw new IllegalArgumentException("Not enough items");
        }
    }

    public void restock(int amount) {
        quantity += amount;
    }

    public String getInfo() {
        return toString();
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public static void main(String[] args) {
        Item item = new Item("Apple", 1.5, 10);
        System.out.println(item);
        item.sell(5);
        System.out.println(item);
        item.restock(24);
        System.out.println(item);
        System.out.println(item.getInfo());
    }

}
