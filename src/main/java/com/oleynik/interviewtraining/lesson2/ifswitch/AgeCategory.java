package com.oleynik.interviewtraining.lesson2.ifswitch;

import java.util.Scanner;

public class AgeCategory {
    public static String getAgeCategory(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        if (age <= 12) {
            return "Ребёнок";
        }
        if (age <= 17) {
            return "Подросток";
        }
        if (age <= 64) {
            return "Взрослый";
        } else {
            return "Пенсионер";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.println("Результат: " + getAgeCategory(age));
    }
}
