package com.arnab.algos;

import java.util.Arrays;

//When given numbers from range 1 to N, use Cyclic sort
//Selecting a number and swapping with the number at the correct position

public class CyclicSort {
    public static void main(String[] args) {
    int[] nums= {3,5,2,1,4,1,4,3};
    csort(nums);
    System.out.println(Arrays.toString(nums));
    }
    public static void csort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if (arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
    }
    public static void swap(int[] arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
