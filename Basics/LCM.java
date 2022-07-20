package com.arnab;
//Program to calculate LCM of two numbers
import java.util.Scanner;
public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm= (a > b) ? a : b;
        int x= lcm;
        int i= 2;
        while(i>0)
        {
            if (x%a==0 && x%b==0){
                System.out.println("LCM is "+x);
                break;
            }
            x=lcm*i;
            i++;
        }

    }
}
