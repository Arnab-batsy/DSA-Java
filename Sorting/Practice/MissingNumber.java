package com.arnab.practice;

public class MissingNumber {
    public int missingNumber(int[] arr) {
        int i=0; //sorting the array just ignoring the arr.length element
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]!=arr[arr[i]]){
                swap(arr,i,arr[i]);
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j) return j;
        }
        //Case 2
        return arr.length;
    }
    void swap(int[] arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
