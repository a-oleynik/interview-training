package com.oleynik.interviewtraining.lesson3.homework.managementsystem.products;

import java.util.Objects;

import static com.oleynik.interviewtraining.lesson3.homework.managementsystem.products.DiscountType.getDiscountTypeByProductType;

public class Product {
    final protected int id;
    protected String name;
    protected double price;
    protected ProductType productType;

    public Product(int id, String name, double price, ProductType productType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.productType = productType;
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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name)
                && productType == product.productType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, productType);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public double applyDiscount(double totalPrice){
        DiscountType discountType = getDiscountTypeByProductType(productType);
        if (totalPrice >= discountType.getMinimalTotalPrice()){
            return price - price * discountType.getDiscount() / 100;
        }
        return price;
    }

}
