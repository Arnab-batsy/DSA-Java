package com.arnab.Practice;

public class RotatedSorted {
    //Rotated Binary Search
    //find the pivot
    //Search in both the halves
    //Case 1: If arr[mid]>arr[mid+1]
    //case 2: If arr[mid]<arr[mid-1]
    //Pivot is the largest number
    //If arr[start]>=arr[mid] then end=mid-1
    //If arr[start]<arr[mid] then start=mid+1
    //If mid was pivot then it would've been found in case 1 or 2. Hence, Proved that bigger numbers lie ahead.

    public static void main(String[] args) {
//        int[] arr ={5,6,7,8,9,12,0,3,4};
        int[] arr={3,1};
//        int[] arr= {0,1,2,3,5,6,9};
        int target=1;
        int pivot=findPivot(arr);
        if(pivot!=-1){
            int ans= bsearch(arr,target,0,pivot);
            if(ans==-1){
                ans=bsearch(arr,target,pivot+1,(arr.length-1));
                System.out.println(ans);
            }
            else{
                System.out.println(ans);
            }
        }
        else{
            int ans=bsearch(arr,target,0,(arr.length-1));
            System.out.println(ans);
        }
    }
    static int findPivot(int[] arr){
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){ //To prevent array Index out of bound
                return mid;
            }
            else if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            else if(arr[start]>=arr[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    static int bsearch(int[] arr, int target,int start,int end){
        while(start<=end){
            int mid= start+(end-start)/2;
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
