package com.Akd.Backtracking;
//Q- You're at (0,0). In how many ways can you reach to the end of a nxn matrix?
//Now you can go in any of the 4 directions, and you also have to print the matrix along with the path.

import java.util.Arrays;

public class Back2 {
    public static void main(String[] args) {
        int[][] arr ={{0,0,0},{0,0,0},{0,0,0}};
        backtrackPrintPaths("",arr,0,0,1);
    }
    //Take a step variable in the argument
    //Update the path in the array
    //Print it in base condition
    //Backtrack
    private static void backtrackPrintPaths(String p, int[][] arr, int r, int c,int step) {
        if(r==arr.length-1 && c==arr[0].length-1){
            arr[r][c]=step;
            for (int[] path : arr) {
                System.out.println(Arrays.toString(path));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(arr[r][c]!=0){
            return;
        }
        //I am considering this as a block in my path. Marking the visited.
        arr[r][c]=step;
        if(r<arr.length-1){
            backtrackPrintPaths(p+"D",arr,r+1,c,step+1);
        }
        if(c<arr[0].length-1){
            backtrackPrintPaths(p+"R",arr,r,c+1,step+1);
        }
        //For Up
        if(r>0){
            backtrackPrintPaths(p+"U",arr,r-1,c,step+1);
        }
        //For Left
        if(c>0){
            backtrackPrintPaths(p+"L",arr,r,c-1,step+1);
        }
        //This is where my function will be over
        //Before it gets removed from stack, also remove the changes made by the function
        arr[r][c]=0;
    }
}
