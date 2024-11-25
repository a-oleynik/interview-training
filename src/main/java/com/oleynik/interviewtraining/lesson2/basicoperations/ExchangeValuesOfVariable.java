package com.oleynik.interviewtraining.lesson2.basicoperations;

import java.util.Scanner;

public class ExchangeValuesOfVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите переменные a и b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        System.out.printf("До обмена: a = %1$d, b = %2$d\n", a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("После обмена: a = %1$d, b = %2$d", a, b);
    }
}
