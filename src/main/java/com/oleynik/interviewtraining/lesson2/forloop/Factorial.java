package com.oleynik.interviewtraining.lesson2.forloop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Факториал: " + factorial(number));
    }

    public static int factorial(int number) {
        int result = 1;
        for (int i = 2; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}
