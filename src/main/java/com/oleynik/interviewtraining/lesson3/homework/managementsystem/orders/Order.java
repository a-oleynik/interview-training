package com.oleynik.interviewtraining.lesson3.homework.managementsystem.orders;

import com.oleynik.interviewtraining.lesson3.homework.managementsystem.products.Product;
import com.oleynik.interviewtraining.lesson3.homework.managementsystem.users.Customer;

import java.util.ArrayList;
import java.util.List;

public class Order {
    final private int orderId;
    final private Customer customer;
    final private List<Product> products;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        products = new ArrayList<>();
    }

    public Order(int orderId, Customer customer, List<Product> products) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = products;
    }

    public int getOrderId() {
        return orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product){
        products.remove(product);
    }

    public double getDiscountedTotalPrice() {
        double totalPrice = getTotalPrice();
        double discountedTotalPrice = 0;
        for (Product product : products) {
            discountedTotalPrice += product.applyDiscount(totalPrice);
        }
        return discountedTotalPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customer=" + customer +
                ", products=" + products +
                '}';
    }
}
