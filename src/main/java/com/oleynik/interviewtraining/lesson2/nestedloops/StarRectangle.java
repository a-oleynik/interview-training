package com.oleynik.interviewtraining.lesson2.nestedloops;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ширину N и высоту M прямоугольника: ");
        int width = sc.nextInt();
        int height = sc.nextInt();
        sc.close();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
