package com.arnab.algos;
//Not Stable

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {25,6,0,-6,26,1};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //Find the maximum item in the remaining array and swap it with the correct index
            int last = arr.length - 1 - i;
            int max = max(arr, 0, last);
            swap(arr, max, last);
        }
    }

    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }

    public static int max(int[] arr, int s, int e) {
        int max = s;
        for (int i = s; i <= e; i++) {
            if (arr[max] < arr[i]) max = i;
        }
        return max;
    }
}
