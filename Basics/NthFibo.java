package com.condi_n_loop;
//Ques: Find the nth Fibonacci number
import java.util.Scanner;
public class NthFibo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the term");
        int n= sc.nextInt();
        int a=0;
        int b= 1;
        int next=0;
        for(int i=1; i<(n-1); i++)
        {
            next= a+b;
         a=b;
         b=next;
        }
        System.out.println(next);
    }
}
