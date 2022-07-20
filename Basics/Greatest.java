package com.assignment_1;

import java.util.Scanner;
public class Greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1 ");
        int n1= sc.nextInt();
        System.out.print("Enter number 2 ");
        int n2 = sc.nextInt();
        if (n1>= n2)
            System.out.println("The greatest number is "+ n1);
        else
            System.out.println("The greatest number is "+ n2);

    }
}

