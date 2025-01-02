package com.oleynik.additionaltasks;

import org.assertj.core.util.Lists;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

// Java Interview coding Challenge. Remove Duplicates From a List in Java
public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> listWithDuplicates = Lists.newArrayList(3, 7, 8, 3, 5, 6, 5, 6, 7, 100, 0, 0, 1, 2, 3);
        System.out.println(listWithDuplicates);

        // 1) Usage of Set

        List<Integer> listWithoutDuplicates = new ArrayList<>(new LinkedHashSet<>(listWithDuplicates));
        System.out.println(listWithoutDuplicates);

        // 2) stream and distinct

        System.out.println(listWithDuplicates.stream()
                .distinct()
                .toList());

        // 3) Create a new list, Traverse the initial list in a loop and add the distinct values to the new list.

        List<Integer> listWithoutDuplicates2 = new LinkedList<>();
        for (Integer number: listWithDuplicates) {
            if(!listWithoutDuplicates2.contains(number)){
                listWithoutDuplicates2.add(number);
            }
        }

        System.out.println(listWithoutDuplicates2);
    }
}
