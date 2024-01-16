package com.Akd.Elementary;
//Q- Find the sum of n numbers

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    private static int sum(int n) {
        if(n==1){
            return 1;
        }
        return n+ sum(n-1);
    }
}
