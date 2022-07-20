package com.assignment_1;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        int a = sc.nextInt();

        if (a % 2 == 0)
            System.out.println("The number is Even");
        else
            System.out.println("The number is odd");
    }
}
