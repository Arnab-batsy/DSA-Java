package com.Akd.Subset;
//take an array and print all it's subsets
//The array might contain duplicate elements

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateSubset {
    public static void main(String[] args) {
        //Whenever you find any duplicate element, only add it in the newly created subset of the previous step
        int[] arr= {2,1,2}; //Array must be sorted or duplicates must be together
        System.out.println(subset(arr));
    }
    public static ArrayList<ArrayList<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> outer= new ArrayList<>();
        outer.add(new ArrayList<>());
        int start;
        int end=0;
        for(int i=0; i<arr.length; i++){
            start=0;
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1; //When current and previous elements are same
            }
            end=outer.size()-1;
            int n= outer.size();
            for(int j=start; j<n; j++){
                ArrayList<Integer> internal= new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
//Complexity= O(N* 2^N)
