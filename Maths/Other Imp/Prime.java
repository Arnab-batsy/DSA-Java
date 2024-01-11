package com.arnab.Maths;
//Q- Find all the prime numbers less than 20
//Complexity- n*sqrt(n)

public class Prime {
    public static void main(String[] args) {
        int n=20;
        for(int i=1; i<=n;i++) {
            if(isPrime(i))
            System.out.print(i+" ");
        }
    }
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return true;
    }
}
