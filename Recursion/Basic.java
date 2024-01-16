package com.Akd.Elementary;
//Q- Print n to 1
public class Basic {
    public static void main(String[] args) {
//        fun(5);
//        funRev(6);
        funBoth(5);
    }
    private static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun(n-1);
    }
    private static void funRev(int n) {
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.print(n+" ");
        //It will only print when all other fn calls have finished executing.
    }
    private static void funBoth(int n) {
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        funBoth(n-1);
        System.out.print(n+" ");
    }
}
