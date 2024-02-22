package com.Akd.InterviewQues;
//Return the number of ways N Queens can be placed in a chessboard of size NxN so that none attack each other
//https://leetcode.com/problems/n-queens-ii/description/

//Time Complexity- O(N!)

public class NQueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board= new boolean[n][n];
        //True means a queen is placed already
        System.out.println(nQueens(board,0));
    }
    public static int nQueens(boolean[][] board, int row){
        if(row==board.length){
            //It means, we come out of the last row i.e, all the queens have been placed.
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        //Placing the Queen and checking for every row and column
        for(int col=0;col<board.length;col++){
            //Place the queen if it's safe
            if(isSafe(board, row, col)){
                board[row][col]=true;
                count= count + nQueens(board,row+1);
                board[row][col]=false; //Backtracking
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //check in the vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }

        //Check diagonal left
        int maxLeft= Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        //Check diagonal right
        int maxRight= Math.min(row, board.length-col-1);
        for (int i = 1; i <=maxRight; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
    return true;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
