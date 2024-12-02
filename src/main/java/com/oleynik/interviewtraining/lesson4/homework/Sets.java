package com.oleynik.interviewtraining.lesson4.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Sets {
    /*
    Написать функцию, которая принимает массив целых чисел и возвращает количество уникальных чисел в этом массиве.
     */
    public static int countArrayUniqueNumbers(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int i : array) {
            set.add(i);
        }
        return set.size();
    }

    public static int countArrayUniqueNumbers2(int[] array) {
        return Arrays.stream(array).boxed().collect(Collectors.toSet()).size();
    }

    public static int countArrayUniqueNumbers3(int[] array) {
        return (int) Arrays.stream(array).distinct().count();
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 6, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9};
        System.out.println(countArrayUniqueNumbers(array));
        System.out.println(countArrayUniqueNumbers2(array));
        System.out.println(countArrayUniqueNumbers3(array));
    }
}
