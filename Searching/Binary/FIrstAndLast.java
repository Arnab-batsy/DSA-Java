package com.arnab.Practice;

public class FIrstAndLast {
        public int[] searchRange(int[] nums, int target) {
            int[] ans={-1,-1};
            ans[0]=Bsearch(nums,target,true);
            ans[1]=Bsearch(nums,target,false);
            return ans;
        }
        public int Bsearch(int[] nums,int target,boolean findStartIndex){
            int ans=-1;
            int start=0;
            int end=nums.length -1;
            while(start<=end){
                int mid= start + (end-start)/2;
                if(nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    ans=mid;
                    if(findStartIndex){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
            }
            return ans;
        }
}
