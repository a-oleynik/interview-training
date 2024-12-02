package com.oleynik.interviewtraining.lesson4.homework;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Queues {
    /*
    Разработать метод, который использует очередь для ротации элементов массива вправо на k позиций.
     */
    public static int [] rotate(int[] nums, int k) {
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < nums.length - k; i++) {
            queue.add(nums[i]);
        }
        for (int i = nums.length - 1; i > k; i--) {
            queue.addFirst(nums[i]);
        }
        return queue.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int [] rotate2(int[] nums, int k) {
        int [] result = new int[nums.length];
        for (int i = 0, j = k; i < nums.length - k; i++, j++) {
            result[j] = nums[i];
        }
        for (int i = nums.length - 1, j = k - 1; i > k; i--, j--) {
            result[j] = nums[i];
        }
        return result;
    }

    public static int[] rotate3(int[] nums, int k) {
        int length = nums.length;
        if (k > length) {
            k = k % length;
        }
        reverse(nums, 0, length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, length - 1);
        return nums;
    }

    public static void reverse(int[] nums, int iFirst, int iLast) {
        int temp;
        int last = iFirst + (iLast - iFirst + 1) / 2;
        for (int i = iFirst, j = iLast; i < last; i++, j--) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }

    public static void main(String[] args) {
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 4;
        System.out.println("Original array: " + Arrays.toString(nums));
        int [] rotated = rotate(nums, k);
        System.out.println("Rotated array (1): " + Arrays.toString(rotated));
        int [] rotated2 = rotate2(nums, k);
        System.out.println("Rotated array (2): " + Arrays.toString(rotated2));
        int [] rotated3 = rotate3(nums, k);
        System.out.println("Rotated array (3): " + Arrays.toString(rotated3));
    }
}
