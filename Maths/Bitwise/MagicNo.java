package com.arnab.Bitwise;
//Amazon Interview Question
//Find the nth magic no.

public class MagicNo {
    public static void main(String[] args) {
        int n=3;
        find(n);
    }

    public static void find(int n) {
        int temp=0;
        int i=1;
        while(n>0) {
            //we right shift, take the last binary digit until n becomes 0
            //since we don't know the no. of digits
            temp = (int) (temp + (Math.pow(5,i)*(n & 1)));
            n = n >> 1;
            i++;
        }
        System.out.println(temp);
        //Complexity= no. of time loop runs= no. of digits
        //O(n)= log(N)
    }
}
