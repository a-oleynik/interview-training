package com.oleynik.interviewtraining.lesson2.forloop;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите N: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.print("Чётные числа: ");
        for (int i = 2; i <= number; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
}
