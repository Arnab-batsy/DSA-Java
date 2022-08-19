package com.arnab;

public class LinearSearch {
    public static void main(String[] args) {
       int[] arr = {12, 1, 25, 3, 0, -6, -20, 7};
       int ans= search(arr,7);
        System.out.println(ans);
    }
    //Search the element in the array, return the index if the item is found.
    //Otherwise return -1;
    static int search(int[]a, int b){
        if(a.length==0){
            return -1;
            //Case might occur when the array has no elements.
        }
        //Run for loop.
        for(int i=0;i<a.length;i++){
            //check for element at every index if it's = target
            if(b==a[i]){
                return i;
            }
        }
        //This line will execute if none of the return statements above have executed
        //Hence target not found
        return -1;
    }
}
