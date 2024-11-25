package com.oleynik.interviewtraining.lesson2.basicoperations;

import java.util.Scanner;

public class CelsiusFahrenheit {
    public static int celsiusToFahrenheit(int celsius) {
        return ((celsius * 9) / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсиях: ");
        int c = sc.nextInt();
        System.out.println("Температура в Фаренгейтах: " + celsiusToFahrenheit(c));
    }
}
