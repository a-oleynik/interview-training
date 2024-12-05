package com.oleynik.interviewtraining.lesson5.sorting;

import com.oleynik.interviewtraining.lesson5.sorting.strategies.SortingStrategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        SortingStrategy bubbleSortingStrategy = new SortingStrategyHandler().getSortingStrategy(SortingType.BUBBLE);
        int [] sortedArray = bubbleSortingStrategy.sort(new int[]{-2, -100, 1, 10, 100, 2, 3});
        System.out.println(Arrays.toString(sortedArray)); // [-100, -2, 1, 2, 3, 10, 100]

        SortingStrategy insertionSortingStrategy = new SortingStrategyHandler().getSortingStrategy(SortingType.INSERTION);
        sortedArray = insertionSortingStrategy.sort(new int[]{-2, -100, 1, 10, 100, 2, 3});
        System.out.println(Arrays.toString(sortedArray)); // [-100, -2, 1, 2, 3, 10, 100]
    }
}
