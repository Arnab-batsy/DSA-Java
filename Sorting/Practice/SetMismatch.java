package com.arnab.practice;

import java.util.Arrays;

class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {8, 7, 3, 5, 3, 6, 1, 4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {
        csort(arr);
        int[] nums = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != (i + 1)) {
                nums[0] = arr[i];
                nums[1] = i + 1;
                return nums;
            }
        }
        return new int[]{-1, -1};
    }

    static void csort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else i++;
        }
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
