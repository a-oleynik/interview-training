package com.oleynik.interviewtraining.lesson3.homework.managementsystem;

import com.oleynik.interviewtraining.lesson3.homework.managementsystem.orders.Order;

import java.util.ArrayList;
import java.util.List;

public class DatabaseOperations {
    private final List<Order> orders;

    public DatabaseOperations() {
        this.orders = new ArrayList<>();
    }

    public DatabaseOperations(List<Order> orders) {
        this.orders = orders;
    }

    public Order getOrder(int orderId) {
        for (Order order : orders) {
            if (order.getOrderId() == orderId) {
                return order;
            }
        }
        return null;
    }

    public void saveOrder(Order order) {
        orders.add(order);
    }

    public void removeOrder(Order order) {
        orders.remove(order);
    }

    public List<Order> getOrders() {
        return orders;
    }

    @Override
    public String toString() {
        return "DatabaseOperations{" +
                "orders=" + orders +
                '}';
    }

    public static void main(String[] args) {
        DatabaseOperations databaseOperations = new DatabaseOperations();
        System.out.println(databaseOperations);
    }
}
