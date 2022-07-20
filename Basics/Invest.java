package com.arnab;
//Program to calculate Future Investment Value

import java.util.Scanner;

public class Invest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter present value");
        double p = sc.nextDouble();
        System.out.println("Enter rate");
        double r = sc.nextDouble();
        System.out.println("Enter time");
        double t = sc.nextDouble();
        double f= p*Math.pow((1+r/100),t);
        System.out.println("Future Investment value is "+f);
    }
}
