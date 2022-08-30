package com.arnab.Binary;

import java.util.Scanner;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
//        int[] arr= {-25,-6,-3,0,2,5,65,123,450,1415,2100};
        int[] arr= {69,54,12,6,0,-12,-15,-36};
        int target= sc.nextInt();
        int ans= orderAgnosticBS(arr,target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        boolean isAsc= arr[start]<arr[end];
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
