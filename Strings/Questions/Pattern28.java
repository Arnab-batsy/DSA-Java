package com.arnab.Questions;

public class Pattern28 {
    public static void main(String[] args) {
        int n = 5;
        int count = 4;
        int count2 = 0;
        for (int i = 0; i < 2 * n; i++) {
            if (i < n) {
                for (int j = 0; j < 5; j++) {
                    if (j >= count) {
                        System.out.print("* ");
                    } else System.out.print(" ");
                }
                count--;
            } else {
                for (int j = 0; j < 5; j++) {
                    if (j <= count2) System.out.print(" ");
                    else System.out.print("* ");
                }
                count2++;
            }
            System.out.println();
        }
        simpler(5);
    }

    public static void simpler(int n) {
        for (int i = 0; i < (2 * n); i++) {
            int col = i > n ? (2 * n) - i : i;  //Using ternary
            int sp= n-col; //Just add another one for spaces
            for(int j=0;j<sp;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < col; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *