package com.Akd.Elementary;

public class CountZeros {
    public static void main(String[] args) {
        System.out.println("No. of zeros= "+count(300000550));
    }
    private static int count(int n) {
    return helper(n,0);
    }
    //Special Pattern. How to pass a value to the above calls.
    private static int helper(int n, int count) {
        if(n%10==n){
            return count;
        }
        if(n%10==0){
            return helper(n/10,++count);
        }
        else {
            return helper(n/10,count);
        }
    }
}
