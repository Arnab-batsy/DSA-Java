package com.condi_n_loop;
//Ques: Input three numbers and print the largest one
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number ");
        int b = sc.nextInt();
        System.out.println("Enter the Third Number ");
        int c = sc.nextInt();

//        int max= a;
//        if(b>max)
//        {
//          max=b;
//        }
//        if(c>max)
//        {
//            max=c;
//        }
        //Example of If condition without else condition

        int max= Math.max(c, Math.max(a,b));
        System.out.println("The Largest number is "+max);
        //Program still works even when I don't import java.lang.Math


    }
}
