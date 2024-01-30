package com.Akd.Patterns;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 1, 0};
        sSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    //Whenever you need to pass any variable in future function calls, put it in the argument
    private static void sSort(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return;
        }
        if (j < i) {
            if (arr[max] < arr[j]) {
                sSort(arr, i, j + 1, j);
            } else {
                sSort(arr, i, j + 1, max);
            }
        } else {
            swap(arr, max, i-1);
            sSort(arr,i-1,0,0);
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
