package com.Akd.Elementary;
//Given a number find the sum of digits

public class SumDigit {
    public static void main(String[] args) {
        System.out.println(digitSum(15642));
    }

    private static int digitSum(int n) {
        if(n<=9){
            return n;
        }
        return (n%10)+digitSum(n/10);
    }
}
