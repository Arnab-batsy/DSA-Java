package com.arnab.algos;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {25,6,0,-6,26,1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
    for (int i=0;i<arr.length-1;i++){
        for (int j=i+1;j>0;j--){
            if (arr[j]<arr[j-1]){
                swap(arr,j,j-1);
            }
            else{
                break;
            }
        }
    }
    }
    public static void swap(int[] arr, int f, int s) {
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
