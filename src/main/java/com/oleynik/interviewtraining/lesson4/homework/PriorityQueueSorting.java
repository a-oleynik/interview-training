package com.oleynik.interviewtraining.lesson4.homework;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueSorting {
    /*
    Задача 9: Priority Queues
    Написать метод, который использует приоритетную очередь для сортировки массива целых чисел по убыванию.
     */
    public static void main(String[] args) {
        int[] array = {1, 75, 3, 42, 12, 6, 2, 67, 101, 90};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sortArray(array)));
    }

    public static int[] sortArray(int[] array) {
        // Creating empty priority queue
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((a, b) -> b - a);
        for (Integer i : array) {
            pQueue.add(i);
        }
        // Get int[] array from pQueue
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = pQueue.poll();
        }
        return result;
    }
}
