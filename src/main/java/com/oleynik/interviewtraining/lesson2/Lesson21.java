package com.oleynik.interviewtraining.lesson2;

public class Lesson21 {
    // Напишите программу,
    // которая выводит все числа от 1 до 100, которые делятся на 3 или 5.
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println(i);
            }
        }


    }
}
