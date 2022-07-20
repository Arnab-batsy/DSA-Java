package com.assignment_1;

import java.util.Scanner;
public class Operation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int n1= sc.nextInt();
        System.out.println("Enter Number 2");
        int n2= sc.nextInt();
        System.out.println("Enter Operator");
        char op = sc.next().charAt(0);
        if(op== '+')
            System.out.println(n1 + n2);
        else if (op == '-')
            System.out.println(Math.abs(n1 - n2));
        else if (op == '*' | op == 'x' )
            System.out.println(n1*n2);
        else
            System.out.println((n1/n2));


    }
}
