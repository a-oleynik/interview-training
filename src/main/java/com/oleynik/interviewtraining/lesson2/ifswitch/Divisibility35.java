package com.oleynik.interviewtraining.lesson2.ifswitch;

import java.util.Scanner;

public class Divisibility35 {
    public static boolean isDivisibleBy3And5(int number) {
        return number % 15 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        scanner.close();
        if (isDivisibleBy3And5(number)) {
            System.out.println("Результат: Делится на 3 и 5");
        } else {
            System.out.println("Результат: Не делится на 3 и 5");
        }
    }
}
