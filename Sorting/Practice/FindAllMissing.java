package com.arnab.practice;
//Google Interview Question using Cycle sort

import java.util.ArrayList;

public class FindAllMissing {
    public ArrayList<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        ArrayList<Integer> list= new ArrayList<>();
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                swap(arr,i,correct);
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=(j+1)){
                list.add(j+1);
            }
        }
        return list;
    }
    void swap(int[] arr,int a,int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
