package com.oleynik.interviewtraining.lesson2.basicoperations;

import java.util.Objects;
import java.util.Scanner;

public class RectangleArea {
    public static class Rectangle {
        int length;
        int width;

        public Rectangle(int length, int width) {
            this.length = length;
            this.width = width;
        }

        public int getArea() {
            return length * width;
        }

        @Override
        public String toString() {
            return "Rectangle{" +
                    "length=" + length +
                    ", width=" + width +
                    '}';
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return length == rectangle.length && width == rectangle.width;
        }

        @Override
        public int hashCode() {
            return Objects.hash(length, width);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину и высоту прямоугольника: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Rectangle rectangle = new Rectangle(a, b);
        System.out.println("Площадь: " + rectangle.getArea());
    }
}
