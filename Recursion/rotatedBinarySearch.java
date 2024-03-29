package com.Akd.Arrays;

public class rotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr= {5,6,7,8,9,1,2,3};
        int target= 7;
        System.out.println(rbs(arr,target,0, arr.length-1));
    }
    private static int rbs(int[] arr, int target, int s, int e) {
        if(s>e){
            return -1;
        }
        int mid= s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[s]<=arr[mid]){
            //Means left part of the array is sorted
            if(target>=arr[s] && target<=arr[mid]){
                return rbs(arr, target, s, mid-1);
            }
            else return rbs(arr, target, mid+1, e);
        }
            //When right part is sorted
            if(target>=arr[mid] && target<=arr[e]){
                return rbs(arr, target, mid+1,e);
            }
            else{
                return rbs(arr,target,s,mid-1);
            }
    }
}
