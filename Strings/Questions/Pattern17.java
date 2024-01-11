package com.arnab.Questions;

public class Pattern17 {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<(2*n);i++){
            int c= i>n?(2*n-i):i;
            for(int sp=0; sp<n-c;sp++){
                System.out.print("  ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col+" ");
            }
            for(int col=2;col<=c;col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }
}

//                        1
//                      2 1 2
//                    3 2 1 2 3
//                  4 3 2 1 2 3 4
//                5 4 3 2 1 2 3 4 5
//                  4 3 2 1 2 3 4
//                    3 2 1 2 3
//                      2 1 2
//                        1
