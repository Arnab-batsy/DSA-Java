package com.Akd.Elementary;

public class ReverseNumber {
    static int sum = 0;

    private static void rev(int n) {
        if (n == 0) {
            return;
        }
        sum = sum * 10 + n % 10;
        rev(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(revRec(4568));
//        rev(4568);
//        System.out.print(sum);
    }

    public static int revRec(int n) {
        //Sometimes you might need some additional variables in the argument.
        //In that case, make another function.
        int digits= (int)(Math.log10(n)) +1; //To count the number of digits
        return helper(n, digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        return (int)((n%10)*Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
}
