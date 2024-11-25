package com.oleynik.interviewtraining.lesson2.basicoperations;

import java.util.Scanner;

public class AdditionAndSubtraction {
    public static void addSubtract(int a, int b) {
        System.out.println("Сумма: " + (a + b));
        System.out.println("Разность: " + (a - b));
    }

    public static void main(String[] args) {
        // Input from command line
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 2 числа: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        addSubtract(a, b);
    }
}
