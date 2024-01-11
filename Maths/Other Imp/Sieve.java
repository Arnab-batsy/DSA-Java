package com.arnab.Maths;
//Q- Find all the prime numbers less than 20. Optimized.
//Sieve of Eratosthenes. Optimized way
//Auxiliary space= O(n)
//Time Complexity
//n(1/3 + 1/5 + 1/7 + 1/11 + 1/13....) Harmonic progression for primes
//Taylor's Series- log(log N)
//Total- O(N* log(log N))

public class Sieve {
    public static void main(String[] args) {
        int n = 40;
        boolean[] primes = new boolean[n + 1];
        //Initially all the elements are going to be false
        sieve(n, primes);
    }
    //False in array means number is prime
    public static void sieve(int n, boolean[] primes) {
        //Only checking till square root
        for(int i=2; i*i<=n; i++){
            //Excluding all the multiples
            if(!primes[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    primes[j]=true;
                }
            }
        }
        for (int i = 2; i <=n ; i++) {
            if(!primes[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
