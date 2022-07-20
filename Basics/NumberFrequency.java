package com.condi_n_loop;
// Ques: Write a program to print the frequency of a number appearing in a number.
import java.util.Scanner;
public class NumberFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stock number");
        int a = sc.nextInt();
        System.out.println("Enter the freq number");
        int b = sc.nextInt();
int count = 0;
//        String s = String.valueOf(a);
//        int l = s.length();
//        int i = 0;
//        int p = 0;
//        while (i < l) {
//            char ch = s.charAt(i);
//            if ((b == Integer.parseInt(String.valueOf(ch)))) {
//                p++;
//            }
//            i++;
//        }
        while(a>0)
        {
            int rem= a%10;
            if(rem==b)
            {
                count++;
            }
            a=a/10;
        }
        System.out.println("The frequency is " + count);
    }
}
