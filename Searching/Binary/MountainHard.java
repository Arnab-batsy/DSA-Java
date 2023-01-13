package com.arnab.Practice;

public class MountainHard {
    public int findInMountainArray(int target, int mountainArr[]) {
        int start=0;
        int end= mountainArr.length-1;
        while(start<end){
            int mid= start+(end-start)/2;
            if(mountainArr[mid]<mountainArr[mid+1])
                start=mid+1;
            else
                end=mid;
        }
        int peak=end;
        start=0;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(mountainArr[mid]>target){
                end=mid-1;
            }
            else if(mountainArr[mid]<target){
                start= mid+1;
            }
            else{
                return mid;
            }
        }
        if(start>end){
            start=peak;
            end= mountainArr.length-1;
            while(start<=end){
                int mid= start+(end-start)/2;
                if(mountainArr[mid]>target){
                    start= mid+1;
                }
                else if(mountainArr[mid]<target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        return -1;
    }
}
