package com.oleynik.interviewtraining.lesson2.forloop;

import java.util.Scanner;

public class MultiplicationForNumber {
    public static void printMultiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();
        printMultiplicationTable(number);
    }
}
