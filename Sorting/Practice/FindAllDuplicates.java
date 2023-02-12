package com.arnab.practice;

import java.util.ArrayList;

public class FindAllDuplicates {
        public ArrayList<Integer> findDuplicates(int[] nums) {
            int i=0;
            ArrayList<Integer> li= new ArrayList<>();
            while(i<nums.length){
                int correct= nums[i]-1;
                if(nums[i]!=nums[correct]){
                    swap(nums,i,correct);
                }
                else i++;
            }
            for(int j=0;j<nums.length;j++){
                if(nums[j]!=(j+1)) li.add(nums[j]);
            }
            return li;
        }
        void swap(int[] arr,int a,int b){
            int temp= arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }
