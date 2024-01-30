package com.arnab.algos;
//Divide the array into two parts, sort them and merge them
//Time Complexity= Nlog(N)
//Space Complexity= O(N)

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr= {5,4,3,1,2,9};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    public static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid= arr.length/2; //Dividing
        int[] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int i=0; //Pointer for first array
        int j=0; //Pointer for second array
        int k=0; //Pointer for result array
        int[] mix= new int[first.length+second.length];
        while(i<first.length && j<second.length ){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;
            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //It may be possible that traversing through one of the arrays is not complete.
        //In that case, copy the remaining elements
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }
        //only one of these loops will run
        return mix;
    }
}
