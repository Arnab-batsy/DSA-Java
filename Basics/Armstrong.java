package com.assignment_1;

import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter lower range ");
        int a= sc.nextInt();
        System.out.print("Enter higher range ");
        int b= sc.nextInt();
        System.out.println("The Armstrong numbers between "+a+" & "+b+" are:");
        int z= 0;
        for (int i= a; i<=b; i++)
        {
            String n= String.valueOf(i);
            int l= n.length();
            int p= 0;
            for (int j=0; j<l; j++)
            {
                char q= n.charAt(j);
                int c= q- '0';
                double y= Math.pow(c,l);
                p=p+ (int)y;
            }
            if (p==i) {
                System.out.println(p);
                z++;
            }
        }
        if (z==0)
            System.out.println("There are none");
    }
}
