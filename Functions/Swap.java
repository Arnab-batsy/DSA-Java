package com.arnab;
public class Swap {
    public static void main(String[] args) {
        int a= 10;
        int b= 20;
        swapno(a,b);
//        System.out.println(a+ " "+b);
        // Won't work cuz void function is used to display or print something only.
        // It does not return any value and thus doesn't change the values of a and b.
    }
    static void swapno(int a, int b){
        // Not a problem cuz a and b are local variables
        int c= b;
        b=a;
        a=c;
        System.out.println(a+ " "+b);
    }
}
