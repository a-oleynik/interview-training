package com.oleynik.interviewtraining.lesson4.homework;

import java.util.List;

public class Lists {
    /*
    Разработать метод, который принимает список целых чисел и удаляет из него все четные числа.
     */

    public static List<Integer> removeEven(List<Integer> list) {
        return list.stream().filter(i -> i % 2 != 0).toList();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original list:");
        System.out.println(list);
        System.out.println("List without even numbers:");
        System.out.println(removeEven(list));
    }
}
