package com.assignment_1;

import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number ");
        int n= sc.nextInt();
        int n1= 0,n2= 1;
        for (int i = 0; i<n; ++i)
        {
            System.out.print(n1 + ",");
            int next= n1+n2;
            n1=n2;
            n2=next;
        }

    }
}
