package com.arnab.Questions;

public class Pattern31 {
    public static void main(String[] args) {
        int n=4;
        int t=8;
        for(int i=0;i<t-1;i++){
            for(int j=0; j<t-1;j++){
                int valAtIndex=n- Math.min( Math.min(i,j),Math.min((t-2-i),(t-2-j)) );
                System.out.print(valAtIndex+"  ");
            }
            System.out.println();
        }
    }
}

//        4  4  4  4  4  4  4
//        4  3  3  3  3  3  4
//        4  3  2  2  2  3  4
//        4  3  2  1  2  3  4
//        4  3  2  2  2  3  4
//        4  3  3  3  3  3  4
//        4  4  4  4  4  4  4