package com.arnab.Questions;

public class Pattern5 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i<=5){
                for(int j=1;j<=i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
            else {
                int n=10;
                for (int j=1;j<=n-i;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
        simpler(5);
    }
    static void simpler(int n){
        for(int i=0;i<(2*n);i++){
            int col= i>n?(2*n)-i:i;  //Using ternary
            for(int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *