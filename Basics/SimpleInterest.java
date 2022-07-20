package com.assignment_1;

import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the principal amount ");
        int p = sc.nextInt();
        System.out.print("Please enter the rate of Interest ");
        int r = sc.nextInt();
        System.out.print("Please enter the time duration ");
        int t = sc.nextInt();
        int i= (p*r*t)/100;
        System.out.println("The Simple Interest is "+i);
    }
}
