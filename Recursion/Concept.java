package com.Akd.Elementary;

public class Concept {
    public static void main(String[] args) {
        fun(5);
    }

    private static void fun(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(--n);
//      fun(n--);
        //It'll give infinite recursion. Here, it always passes 5.
        //n-- vs --n
        //n-- will pass the value of n first and then subtract it
        //while --n subtracts and then passes the value of n

    }
}
