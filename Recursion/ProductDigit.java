package com.Akd.Elementary;
//Given a number find the sum of digits

public class ProductDigit {
    public static void main(String[] args) {
        System.out.println(digitProduct(156042));
    }

    private static int digitProduct(int n) {
        if(n<=9){
            return n;
        }
        return (n%10)*digitProduct(n/10);
    }
}
