package com.arnab.Bitwise;
//Various Operations that we can do on a Pascal's Triangle

public class PascalsTriangle {
    public static void main(String[] args) {
        int r = 6;
        int c = 3;
        //to find the element at a given row and Column
        elementAt(r, c);
        //To Print a given Row
        printRow(r);
        //To Print the whole triangle until the given row
        printTriangle(r);
        //To find the sum of all the elements in a given row
        sumOfRow(r);
    }

    public static void elementAt(int r, int c) {
        //It's basically rowCcol
        int res = 1;
        for (int i = 1; i < c; i++) {
            res = res * (r - i);
            res = res / (i);
        }
        System.out.println(res);
    }

    public static void printRow(int r) {
        int ans = 1;
        System.out.print(ans + " ");
        //Since every row has r elements
        for (int i = 1; i < r; i++) {
            ans = ans * (r - i);
            ans = ans / i;
            System.out.print(ans + " ");
        }
        System.out.println();
    }

    public static void printTriangle(int r) {
        for (int i = 1; i <= r; i++) {
            printRow(i);
        }
    }

    public static void sumOfRow(int r) {
        //Here sum of all the elements is-
        //nC1+ nC2+ nC3+ .... nCn =2^n
        //Sum of elements of the nth row is 2^(n-1) since rows start form 0
        int ans = 1 << (r - 1);
        System.out.println(ans);
    }
}