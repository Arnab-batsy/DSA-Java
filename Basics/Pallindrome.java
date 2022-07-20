package com.assignment_1;

import java.util.Scanner;
public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the name/number ");
        String name= sc.next();
        String rev= "";

        int length= name.length();
        for (int i = length-1; i>=0; i--)
        {
            char c= name.charAt(i);
            rev= rev + c;
        }
        System.out.println(rev);
        if(name.equals(rev))
            System.out.println("It is pallindrome");
        else
            System.out.println("It isn't");


    }
}
