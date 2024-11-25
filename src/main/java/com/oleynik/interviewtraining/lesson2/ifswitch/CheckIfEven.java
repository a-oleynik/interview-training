package com.oleynik.interviewtraining.lesson2.ifswitch;

import java.util.Scanner;

public class CheckIfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int n = sc.nextInt();
        sc.close();
        if (n % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
        sc.close();
    }
}
