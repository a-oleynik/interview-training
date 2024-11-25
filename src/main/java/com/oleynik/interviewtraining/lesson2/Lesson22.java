package com.oleynik.interviewtraining.lesson2;

import java.util.Scanner;

public class Lesson22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}
