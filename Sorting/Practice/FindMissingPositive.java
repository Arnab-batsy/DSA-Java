package com.arnab.practice;
//Hard because it directly doesn't tell us about 1 to N and thus using cyclic sort

public class FindMissingPositive {
    public int firstMissingPositive(int[] nums) {
    csort(nums);
        for(int i=0;i<nums.length;i++){
        if(nums[i]!=i+1) return (i+1);
    }
        return (nums.length+1);
}
    static void csort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(correct<arr.length && arr[i]>0 && arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
    }
    static void swap(int[] arr, int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
