package com.arnab.Practice;
//Find the greatest number in the given array which is smaller than or equal to the target number
public class Floor {
    public static void main(String[] args) {
        int[] arr= {2,3,5,9,14,16,18};
        int target=1;
        System.out.println(binarysearch(arr,target));
    }
    public static int binarysearch(int[] arr,int target){
        int start=0;
        int end=arr.length -1;

        while(start<=end){
            int mid= start+(end-start)/2;
            if(target<arr[0]){
                return -1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return arr[mid];
            }
        }
        return arr[end];
    }
}
