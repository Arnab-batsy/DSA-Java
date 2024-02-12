package com.arnab.algos;
//Often asked directly in many interviews
//Choose a pivot. On each pass, elements on the LHS will be <pivot and on the RHS will be >pivot
//i.e, the pivot will be paced at the correct position at every pass.

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,1,2,9,7,6};
//        quickSort(arr,0,arr.length-1);
        Arrays.sort(arr); //Internal Hybrid sort
        System.out.println(Arrays.toString(arr));
    }

    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int mid= s+(e-s)/2;
        int pivot= arr[mid];

        while(s<=e){
            //If it's already sorted, it will not swap
            while (arr[s]<pivot){
                s++;
            }
            while(arr[e]>pivot){
                e--;
            }
            //Condition might arise before parent loop ends. So, double-checking.
            if(s<=e){
                //Swap
                int temp= arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        //Now pivot is at correct index. Sort two halves now.
        quickSort(arr,low,e);
        quickSort(arr,s,high);
    }
}
