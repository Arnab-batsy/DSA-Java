package com.arnab.Practice;
//Ques: Find position of an element in a sorted array of infinite numbers
//i.e., a very long array, but you don't know the size and can't use length function
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

public class InfinitePos {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,11,13,14,15,17,19,20,21,22,23,26,28,29,30,33};
        int target=20;
        System.out.println(search(arr,target));
    }
    public static int search(int[] arr, int target){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int newStart= end+1;
            end= end+ (end-start+1)*2;
            start= newStart;
        }
        return binarySearch(arr,target,start,end);
    }
    public static int binarySearch(int[] arr, int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
