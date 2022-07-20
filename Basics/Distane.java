package com.arnab;
//Calculate Distance Between Two Points
import java.util.Scanner;
import java.lang.Math;
public class Distane {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the co-ordinates of point 1");
        double x1= sc.nextDouble();
        double y1= sc.nextDouble();
        System.out.println("Enter the co-ordinates of point 2");
        double x2= sc.nextDouble();
        double y2= sc.nextDouble();
        double dist= Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println(dist);
    }
}
