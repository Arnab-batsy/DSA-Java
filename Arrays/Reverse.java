package com.arnab;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 25, 36, 2, 17};
       rev(arr);
    }
    //Two pointer Method
    static void rev(int[] arr){
        int start= 0;
        int end= arr.length-1;
        while(start<end){
            //Swap
            swap(arr, start, end);
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int index1, int index2){
        int temp= arr[index1];
        arr[index1]=arr[index2];
        arr[index2]= temp;
    }
}
