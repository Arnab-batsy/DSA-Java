package com.Akd.InterviewQues;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '8', '.', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0; i< 9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]!='.'){
                    if(!isSafe(board,i,j,board[i][j])) return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafe(char[][] board, int row, int col, char num){
        //Check in row
        for(int i = 0; i < 9; i++){
            if(i!=col){
                if(board[row][i] == num)
                    return false;
            }
        }
        //Check in column
        for(int i = 0; i < 9; i++){
            if(i!=row){
                if(board[i][col] == num)
                    return false;
            }
        }
        //Check in the box
        int startRow= row- row%3;
        int startCol= col- col%3;
        for(int r =startRow; r< startRow+ 3; r++){
            for ( int c= startCol; c< startCol + 3; c++){
                if(r!=row && c!=col && board[r][c]==num) return false;
            }
        }
        return true;
    }
}
