package com.Akd.Patterns;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {4,3,2,1,0};
        bsort(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
    private static void bsort(int[] arr, int i, int j) {
        if (i == 0) {
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]) {
                swap(arr, j, j + 1);
            }
            bsort(arr, i, j + 1);
        }
        else {
            bsort(arr,i-1,0);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
