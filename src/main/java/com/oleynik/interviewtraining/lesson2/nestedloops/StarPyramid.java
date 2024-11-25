package com.oleynik.interviewtraining.lesson2.nestedloops;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите высоту пирамиды: ");
        int height = sc.nextInt();
        sc.close();
        for (int i = 0; i < height; i++) {
            printCharacter(height - i - 1, " ");
            printCharacter(1 + i * 2, "*");
            printCharacter(height - i - 1, " ");
            System.out.println("");
        }
    }

    public static void printCharacter(int width, String character) {
        for (int i = 0; i < width; i++) {
            System.out.print(character);
        }
    }
}
