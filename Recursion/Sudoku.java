package com.Akd.InterviewQues;
//Write a program to solve a Sudoku puzzle by filling the empty cells.
//Rules-
//Each of the digits 1-9 must occur exactly once in each row.
//Each of the digits 1-9 must occur exactly once in each column.
//Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.
//https://leetcode.com/problems/sudoku-solver/description/

//Time Complexity= 9^(n^2) XD
//Space Complexity- n^2

public class Sudoku {
    //Identifying Backtracking- Whenever you're putting a potential answer somewhere
    //If that is going to affect the future answers be it right or wrong, it's backtracking.
    public static void main(String[] args) {
        int[][] board= {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(solveSudoku(board));
    }

    static boolean solveSudoku(int[][] board){
        int n= board.length;
        int r= -1;
        int c= -1;

        boolean emptyLeft= true; //To check if there is any empty element before the given r and c.
        //At each fn call, all the left elements will be filled so resetting it to true.

        //This is how we are replacing r,c from the arguments
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n; j++) {
                //when I find an empty item
                if(board[i][j]==0){
                  r=i;
                  c=j;
                  emptyLeft=false;
                  break;
                }
            }
            //If you find any empty element in the row, break
            if(!emptyLeft) break;
        }
        if(emptyLeft) {
            display(board);
            return true; //Means Sudoku is Solved
        }

        //backtrack
        for(int i=1; i<=9; i++){
            if(isSafe(board,r,c,i)){
                board[r][c]=i;
                if(solveSudoku(board)) return true; //Found the answer
                else board[r][c]=0;
            }
        }
        return false;
    }
    static void display(int[][] board){
        for(int[] row: board){
            for (int num: row) {
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }
    static boolean isSafe(int[][] board, int row, int col, int num){
        //Check in the row
        for(int i = 0; i < board.length; i++){
            if(board[row][i] == num)
                return false;
        }
        //Check in column
        for (int[] ints : board) {
            if (ints[col] == num)
                return false;
        }

        //Check in box
        //For any position in the box, find out the start indexes of the box by row - row%3 (You get it)
        int sqrt= (int)Math.sqrt(board.length);
        int rowStart= row - row%sqrt;
        int colStart= col - col%sqrt;
        for(int r = rowStart; r< rowStart+ sqrt; r++){
            for ( int c= colStart; c< colStart + sqrt; c++){
                if( board[r][c]==num) return false;
            }
        }
        return true;
    }
}
