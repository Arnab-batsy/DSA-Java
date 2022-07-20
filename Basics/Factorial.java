package com.arnab;
//Factorial
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number");
        int n= in.nextInt();
        int fac= 1;
        for(int i=1; i<=n; i++)
        {
            fac= fac*i;
        }
        System.out.println("The factorial of the given number is "+fac);
    }

}
