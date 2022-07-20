package com.arnab;
//Program to calculate HCF of two numbers
import java.util.Scanner;
public class Hcf {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=0;
        for (c= Math.min(a,b); c>0; c--)
        {
         if(a%c==0 && b%c==0){
             break;
         }
        }
        System.out.println("HCF is "+ c);
    }
}
