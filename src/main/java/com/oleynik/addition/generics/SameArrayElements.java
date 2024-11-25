package com.oleynik.addition.generics;

public class SameArrayElements {
    // Write a Java program to create a generic method that takes two arrays of the same type
    // and checks if they have the same elements in the same order.
    public static <T> boolean arraysAreTheSame(T[] array1, T[] array2){
        if (null == array1 || null == array2){
            throw new IllegalArgumentException("The given arrays must not be null");
        }
        if (array1.length != array2.length){
            return false;
        }
        for (int i = 0; i < array1.length; i++){
            if (!array1[i].equals(array2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(arraysAreTheSame(new Integer[]{1,2,3,67, 100}, new Integer[]{1,2,3,67}));
        System.out.println(arraysAreTheSame(new Long[]{1L, 2L, 3L, 67L}, new Long[]{1L, 2L, 3L, 67L}));
    }
}
