package com.Akd.InterviewQues;
//Return the number of ways N Knights can be placed in a chessboard of size NxN so that none attack each other

public class NKnights {
    public static void main(String[] args) {
        int n=3;
        boolean[][] board= new boolean[n][n];
        //True means a Knight is placed already
        nKnights(board,0,0,n);
    }

    private static void nKnights(boolean[][] board, int row, int col, int knights) {
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }

        //When both row and column are out of bound, skip it
        if(row==board.length-1 && col==board.length){
            return;
        }

        //When it reaches the last column of a row.
        //Replacing the for loop with an if and passing value in args
        if(col==board.length){
            nKnights(board,row+1,0,knights);
            return;
        }

        if(isSafe(board,row,col)){
            board[row][col]=true;
            nKnights(board,row,col+1,knights-1);
            board[row][col]=false; //Backtracking
        }

        //when it's not safe, just move ahead
        nKnights(board,row,col+1,knights);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //At first checking if the position gets index out of bound or not
        if(isValid(board,row-2 ,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col){
        if(row>=0 && row < board.length && col >= 0 && col < board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board) {
        for(boolean[] row: board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
