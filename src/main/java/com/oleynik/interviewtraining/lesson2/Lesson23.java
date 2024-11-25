package com.oleynik.interviewtraining.lesson2;

import java.util.Arrays;

public class Lesson23 {
    public static void main(String[] args) {
        int [] array = new int[] {1,4,5,7,9,2,3};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }
// i=0: 1,4,5,7,9,2,3 -> 4,1,5,7,9,2,3 -> 5,1,4,7,9,2,3 -> 7,1,4,5,9,2,3 -> 9,1,4,5,7,2,3
//i =1
// 9, 7,
 public static int[] sort(int[] array){
        int tmp;
        for(int i=0;i<array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] > array[i]) {
                    tmp = array[j];
                    array[j] = array[i];
                    array[i] = tmp;
                }
            }
        }


        return array;
    }
}
