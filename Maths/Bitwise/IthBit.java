package com.arnab.Bitwise;
//Find the ith bit of a given number
//Set the ith bit
//Reset the ith bit

public class IthBit {
    public static void main(String[] args) {
        int a=25;
        int i=4;
        find(a,i);
    }
    public static void find(int a,int i) {
        //AND the given number with a mask where only the ith bit is 1 while all the rest are 0
        //Ex- a=1101101011. AND a with 000010000 to find the 5th
        //The number will be 2^(i-1). ex- 000010000 is 2^4 in decimal. This is 1<<(i-1).
        int x= 1<<(i-1); //Creating mask
        System.out.println(a & x);
    }
    public static void set(int a,int i){
        //Set means turn the ith bit to 1
        //OR the given number with mask
        int x= 1<<(i-1); //Creating mask
    }
    public static void reset(int a,int i){
        //Reset means turn the ith bit to 0
        //AND the given number with the complement of the mask
        int x= 1<<(i-1); //Creating mask
    }
}
