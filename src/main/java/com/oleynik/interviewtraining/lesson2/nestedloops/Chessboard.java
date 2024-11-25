package com.oleynik.interviewtraining.lesson2.nestedloops;

import java.util.Scanner;

public class Chessboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер шахматной доски:");
        final int size = scanner.nextInt();
        scanner.close();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println("");
        }
    }
}
