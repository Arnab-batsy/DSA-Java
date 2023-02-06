package com.arnab.Binary.TwoD;

import java.util.Arrays;

//Matrix sorted in row wise and column wise manner (Not strictly sorted)
//Every row and column is ascending
public class RowcolMatrix{
    public static void main(String[] args) {
        int [][] arr= {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
//                {33,34,38,50}
        };
        int target= 49;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int [] search(int [][] matrix,int target){
        int row=0;
        int col= matrix[0].length-1;
//Starting from the first row and last column
        while(row<matrix.length && col>=0) {
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }
            else if(matrix[row][col]<target){
                row++;
                //since all the elements of row1 are lesser than the element in the last column
                //We eliminate the row
            }
            else{
                col--;
                //Since all the elements of last column are greater than it's first element
                //We eliminate the column
            }
        }
return new int[]{-1,-1};
    }
}