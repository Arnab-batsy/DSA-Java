package com.arnab.Practice;

public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int [] arr= {7,2,5,10,8};
        int k=2;
        System.out.println(splitArray(arr,k));
    }
    public static int splitArray(int[] nums, int m) {
    int start = 0,end= 0;
        for (int num : nums) {
            start = Math.max(start, num);
            //To contain the minimum possibility i.e., the maximum value of any element in the array
            end= end+num;
            //To contain the maximum possibility i.e., the sum of the array
        }
        //Binary search
        while(start<end){
            //Try for the middle as potential answer
            int mid= start+(end-start)/2;

            //Calculate how many pieces you can divide this array into using this sum
            int sum=0;
            int pieces=1;
            for (int num : nums){
                if(sum+num>mid){
                    sum=num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
                //Now Binary Search is done here
                if(pieces>m){
                    start=mid+1;
                }
                else{
                    end=mid;
                }
        }
        return end;
        //Here start and end will be same
    }
}
