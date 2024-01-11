package com.arnab.Bitwise;
//Find the no. of digits in base b

public class CountDigits {
    public static void main(String[] args) {
        int n= 10256;
        int base=16;
        //By formula
        //Else we can do right shift and count until the number becomes 0
        int ans= (int)(Math.log(n)/Math.log(base)) +1;
        System.out.println(ans);
    }
}
