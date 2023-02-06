package com.arnab.Binary.TwoD;

import java.util.Arrays;

//Array is sorted in such a manner that
//the first integer of each row is greater than the last integer of the previous row.
public class SortedMatrix {
    public static void main(String[] args) {
int[][] arr= {
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
//        int[][] arr={{1},{3}};
//        int[][] arr={
//                {1,1},
//                {2,2}
//        };
int target=2;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    //Search in the row provided between the columns provided
    public static int [] binarySearch(int[][] matrix, int row, int cs, int ce, int target){
        while(cs<=ce){
            int mid= cs+ (ce-cs)/2;
            if(matrix[row][mid]==target){
                return new int[] {row, mid};
            }
            else if(matrix[row][mid]<target){
                cs= mid+1;
            }
            else{
                ce=mid-1;
            }
        }
        return new int[] {-1,-1};
    }

    public static int[] search(int[][] matrix, int target){
    int row= matrix.length-1;
    int col= matrix[0].length-1; //Be cautious the matrix may be empty
        if(row==0){
            return binarySearch(matrix,0,0,col,target);
        }
        if(col==0){
            int rs=0;
            int re=row;
            while(rs<=re){
                int mid= rs+ (re-rs)/2;
                if(matrix[mid][0]==target){
                    return new int[] {mid,0};
                }
                else if(matrix[mid][0]<target){
                    rs= mid+1;
                }
                else{
                    re=mid-1;
                }
            }
            return new int[] {-1,-1};
        }
        int rs=0;
        int re=matrix.length-1;
        int cm=col/2;

        //run the loop until two rows are remaining
        while(rs<(re-1)){
            int mid=rs+(re-rs)/2;
            if(matrix[mid][cm]==target){
                return new int[] {mid,cm};
            }
            else if(matrix[mid][cm]<target){
                rs=mid;
            }
            else re=mid;
        }
        //Now we have two rows
        if(matrix[rs][col]>=target) return binarySearch(matrix,rs,0,col,target);
        else return binarySearch(matrix,rs+1,0,col,target);
    }
}
