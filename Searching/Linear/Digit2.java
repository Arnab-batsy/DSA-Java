package com.arnab;
//New Formula to find the number of digits easily
import java.util.Scanner;
public class Digit2 {
    public static void main(String[] args) {
       Scanner obj= new Scanner(System.in);
        System.out.println("enter a number");
        int num= obj.nextInt();
        System.out.println("No. of Digits is "+digit(num));
    }
    public static int digit(int num){
        if (num<0){
            num= num*(-1);
        }if (num==0){
            return 1;
        }
        return (int)(Math.log10(num))+1;
        //formula to find the number of digits

    }
}
