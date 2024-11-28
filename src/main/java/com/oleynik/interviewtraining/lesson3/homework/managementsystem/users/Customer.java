package com.oleynik.interviewtraining.lesson3.homework.managementsystem.users;

import com.oleynik.interviewtraining.lesson3.homework.managementsystem.products.Product;

import java.util.ArrayList;
import java.util.List;

public class Customer extends User {
    private List<Product> cart = new ArrayList<>();

    public Customer(int id, String name, String email) {
        super(id, name, email);
    }

    public void buyProduct() {
        System.out.println("Покупатель купил товар");
    }

    public void addToCart(Product product) {
        cart.add(product);
    }

    public void removeFromCart(Product product) {
        cart.remove(product);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cart=" + cart +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
