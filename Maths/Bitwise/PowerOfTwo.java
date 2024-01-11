package com.arnab.Bitwise;
import java.util.Scanner;
//Tell if a number is power of 2 or not

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        //If n is a power of 2, only the first bit will be 1 and rest all 0
        //Now ex- 100000= 11111+1
        //100000&11111 is 0
        if(n==0){
            System.out.println("Not a power of 2");
        }
        if((n&(n-1))==0){
            System.out.println("Yes it's a power of 2");
        }
        else System.out.println("Not a power of 2");
        //Complexity= O(1)
    }
}
