package com.arnab.Binary;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr= {-25,-6,-3,0,2,5,65,123,450,1415,2100};
        int target= sc.nextInt();
        int ans= binarySearch(arr,target);
        System.out.println(ans);
    }
 static int binarySearch(int[] arr, int target){
        //Return index
        int start=0;
        int end= arr.length -1;

        while(start <= end){
            int mid= start+ (end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}