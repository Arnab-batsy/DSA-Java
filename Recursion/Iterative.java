package com.Akd.Subset;
//take an array and print all it's subsets
//Doing it via Iteration

import java.util.ArrayList;
import java.util.List;

public class Iterative {
    public static void main(String[] args) {
        int[] arr= {1,2,3};
        System.out.println(subset(arr));
    }
    public static List<List<Integer>> subset(int[] arr){
        //Since we are returning a list that contains many other lists as subsets
        //We need to create the outer List first (Wrapper for all the subsets)
        List<List<Integer>> outer= new ArrayList<>();

        outer.add(new ArrayList<>()); //Adding empty list initially
        //Now, for every number in my array, I need to take the size of the current list,
        //create new lists adding that number in all the present lists and add those in my original list.
        for(int num: arr){
            int n= outer.size(); //Number of subsets currently in the outer list
            //We need to create n more lists adding num in every one of them
            for(int i=0;i<n;i++){
                ArrayList<Integer> internal= new ArrayList<>(outer.get(i)); //Creating copy of ith list in the outer list
                internal.add(num); //Adding the number
                outer.add(internal); //Adding all finally
            }
        }
        return outer; //Returning the final outer List in the end
    }

    //Total number of subsets= 2^n
    //Time complexity= (Time taken for each subset * total no. of subsets)
    //O(n*2^n)
    //Actually- O(2^n +2^n-1 +2^n-2 +...2^0)
    //Space complexity- O(2^n * n) //Total subsets * space taken by each subset
}
