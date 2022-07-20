//package com.arnab;
//
////Write a program to find the sum of a series of expansion of sin theta
//import java.util.Scanner;
//public class taylor {
//
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.println("enter the angle");
//        int input= sc.nextInt();
//        double angle= input/180;
//        System.out.println("Enter the number of terms");
//        int term= sc.nextInt();
//        double sum=0;
//        int fact=0;
//        // n the term = (x^(2n-1))/(2n-1)!
//        for (int i = 1; i<=term; i++)
//        {
//            for (int j= 1; j<=i; j++)
//            {
//             fact= fact+((2*i)-1);
//            }
//            if (i%2== 0)
//            {
//                sum = sum - (angle ^ ((2 * i) - 1)) / fact;
//            }
//
//            else {
//                sum = sum + (angle ^ ((2 * i) - 1)) / fact;
//
//            }
//        }
//        System.out.println(sum);
//    }
//}
//// How to use exponent function in a double data type?
