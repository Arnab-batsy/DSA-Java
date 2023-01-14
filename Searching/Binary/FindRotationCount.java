package com.arnab.Practice;
//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
//Eliminating the sorted sub-arrays

public class FindRotationCount {
    public static void main(String[] args) {
        int arr[] = {5, 1, 2, 3, 4};
        System.out.println(noOfRotation(arr));
    }
    static int noOfRotation(int[] arr){
            int start=0;
            int end= arr.length-1;
            while(start<end){
                if(arr[start]<arr[end])
                    return start;
                int mid= start+(end-start)/2;
                if(arr[start]<=arr[mid])
                    start=mid+1;
                else
                    end=mid;
            }
            return start;
    }
}
