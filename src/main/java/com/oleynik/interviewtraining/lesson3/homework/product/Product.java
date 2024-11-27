package com.oleynik.interviewtraining.lesson3.homework.product;

public class Product {
    private String name;
    private double price;
    private int id;

    public Product() {
    }

    public Product(String name, double price, int id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (null == o || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name=" + name +
                ", price=" + price +
                ", id=" + id + "}";
    }

    @Override
    public Object clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.name, this.price, this.id);
        }
    }

    public static void main(String[] args) {
        Product product = new Product("Product1", 100.0, 1);
        System.out.println(product);
        Product productClone = (Product) product.clone();
        System.out.println(productClone);
        System.out.println(product.equals(productClone));
    }

}
