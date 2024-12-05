package com.oleynik.interviewtraining.lesson5.sorting.strategies;

public class BubbleSortingStrategy implements SortingStrategy {
    @Override
    public int [] sort(int[] array) {
        System.out.println("Sorting using bubble sort");
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }
}
