package com.oleynik.interviewtraining.lesson5.sorting.strategies;

public class InsertionSortingStrategy implements SortingStrategy {
    @Override
    public int[] sort(int[] array) {
        System.out.println("Sorting using insert sort");
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}
