package com.arnab;
import java.util.Scanner;
import java.lang.Math;
public class CircumArea {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("The circumference is "+circum(a));
        System.out.println("The area is "+area(a));
    }
    static double circum(double r){
        return 2*Math.PI*r;
    }
    static double area(double r){
        return Math.PI*r*r;
    }
}
