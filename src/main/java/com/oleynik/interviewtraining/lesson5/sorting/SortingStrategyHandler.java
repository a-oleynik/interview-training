package com.oleynik.interviewtraining.lesson5.sorting;

import com.oleynik.interviewtraining.lesson5.sorting.strategies.*;

public class SortingStrategyHandler {
    public SortingStrategy getSortingStrategy(SortingType type) {
        return switch (type) {
            case BUBBLE -> new BubbleSortingStrategy();
            case INSERTION -> new InsertionSortingStrategy();
            case MERGE -> new MergeSortingStrategy();
            case QUICK -> new QuickSortingStrategy();
            case SELECTION -> new SelectionSortingStrategy();
            default -> throw new IllegalArgumentException("Unknown sorting type");
        };
    }
}
