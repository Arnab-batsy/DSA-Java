package com.Akd.Arrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr= {1,4,3,9,10,17};
        System.out.println(sorted(arr,0));
    }

    private static boolean sorted(int[] arr, int index) {
        if(index==arr.length-1){
            return true;
        }
        return (arr[index]<arr[index+1] && sorted(arr,index+1));
    }
    //If you modify the array in one recursion call, it will be modified for all the other recursion calls.
}
