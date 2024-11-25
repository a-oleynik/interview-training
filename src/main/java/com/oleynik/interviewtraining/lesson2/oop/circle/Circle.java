package com.oleynik.interviewtraining.lesson2.oop.circle;

import java.math.BigDecimal;
import java.util.Objects;

public class Circle {
    private final BigDecimal radius;

    public Circle(double radius) {
        this.radius = BigDecimal.valueOf(radius);
    }

    public BigDecimal getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(radius, circle.radius);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public BigDecimal getArea() {
        return radius.pow(2).multiply(BigDecimal.valueOf(Math.PI));
    }

    public BigDecimal getCircumference() {
        return radius.multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI));
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());
    }
}
