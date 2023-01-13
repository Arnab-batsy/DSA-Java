package com.arnab.Practice;
//Find Peak element in a mountain array
public class MountainPeak {
    public static void main(String[] args) {
        int arr[]= {1,3,4,6,7,8,25,5,4,3,1};
        System.out.println(find(arr));
    }
    public static int find(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(arr[mid]>arr[mid+1])
                end=mid;
            else
                start=mid+1;
        }
        return arr[start];
    }
}
