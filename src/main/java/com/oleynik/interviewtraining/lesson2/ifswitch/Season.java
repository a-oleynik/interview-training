package com.oleynik.interviewtraining.lesson2.ifswitch;

import java.util.Scanner;

public class Season {
    public static String getSeason(int month) {
        return switch (month) {
            case 12, 1, 2 -> "Зима";
            case 3, 4, 5 -> "Весна";
            case 6, 7, 8 -> "Лето";
            case 9, 10, 11 -> "Осень";
            default -> throw new IllegalArgumentException("Неверный номер месяца! Введите число от 1 до 12.");
        };
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер месяца (1-12): ");
        int month = scanner.nextInt();
        System.out.println("Результат: " + getSeason(month));
    }
}
