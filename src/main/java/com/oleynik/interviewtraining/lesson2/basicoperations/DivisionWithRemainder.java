package com.oleynik.interviewtraining.lesson2.basicoperations;

import java.util.Scanner;

public class DivisionWithRemainder {
    public static void divisionWithRemainder(int a, int b) {
        System.out.println("Результат деления: " + (a / b));
        System.out.println("Остаток: " + (a % b));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = sc.nextInt();
        System.out.println("Введите второе число: ");
        int b = sc.nextInt();
        sc.close();
        divisionWithRemainder(a, b);
    }
}
