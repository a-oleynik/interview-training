package com.oleynik.interviewtraining.lesson2.forloop;

import java.util.Scanner;

public class ArithmeticProgression {
    public static int arithmeticProgressionSum1(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int arithmeticProgressionSum2(int n) {
        return (1 + n) * n / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.println("Сумма: " + arithmeticProgressionSum1(n));
        //System.out.println("Сумма: " + arithmeticProgressionSum2(n));
    }
}
