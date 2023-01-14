package com.arnab.Practice;

public class DuplicateRotated {
    //Problem: Start, End and Middle might all be same
    //Check for duplicates, eliminate
    //find mid and the part of the array that is sorted
    //find in the sorted part, else reduce the unsorted part and rpeat
    public static void main(String[] args) {
        int arr[]= {2,5,6,0,0,1,2};
        int target=7;
        System.out.println(findPivotDuplicate(arr,target));

    }
    static boolean findPivotDuplicate(int[] arr, int target){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(arr[mid]==target){
                return true;
            }
            //If elements at middle, start and end are equal then skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                start++;
                end--;
            }
            //Check if left part is sorted
            else if(arr[start]<=arr[mid]){
                if(target>= arr[start] && target<arr[mid])
                    end= mid+1;
                else
                    start=mid+1;
            }
            //If right part is sorted
            else{
                if(target> arr[mid] && target<=arr[end])
                    start= mid+1;
                else
                    end=mid-1;
            }
        }
        return false;
    }
}
