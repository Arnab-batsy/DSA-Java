package com.arnab.Maths;
//Euclidean algorithm
//GCD (a, b)= GCD(rem(b,a),a)
//rem(b,a)= b%a

public class EuclideanGCD {
    public static void main(String[] args) {
        int a= 20;
        int b= 30;
        System.out.println(euclidean(a,b));
    }

    private static int euclidean(int a, int b) {
        if(a==0){
            return b;
        }
        return euclidean((b%a),a);
    }
}
