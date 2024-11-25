package com.oleynik.interviewtraining.lesson2.nestedloops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = scanner.nextInt();
        scanner.close();

        for (int i = 2; i < n; i++) {
            if (isPrime(i)){
                System.out.printf("%1$d ", i);
            }
        }
    }

    public static boolean isPrime(int n) {
        int maxN = (int)Math.sqrt(n) + 1;
        for (int i = 2; i < maxN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
