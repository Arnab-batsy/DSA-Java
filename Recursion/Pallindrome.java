package com.Akd.Elementary;

public class Pallindrome {
    public static void main(String[] args) {
        System.out.println(isPallindrome(123545321));
    }

    private static boolean isPallindrome(int n) {
        int digits= (int)(Math.log10(n))+1;
        return(helper(n,digits)==n);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        return (int)((n%10)*Math.pow(10,digits-1))+ helper(n/10,digits-1);
    }
}
