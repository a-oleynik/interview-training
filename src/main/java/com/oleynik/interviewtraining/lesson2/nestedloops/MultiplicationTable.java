package com.oleynik.interviewtraining.lesson2.nestedloops;

public class MultiplicationTable {
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        printMultiplicationTable();
    }
}
