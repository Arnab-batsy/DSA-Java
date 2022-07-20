package com.arnab;
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        evaluate(a);
    }
    static void evaluate(int m){
        if(m>90 && m<=100){
            System.out.println("AA");
        }
        else if(m>80 && m<=90){
            System.out.println("AB");
        }
        else if(m>70 && m<=80){
            System.out.println("BB");
        }
        else if(m>60 && m<=70){
            System.out.println("BC");
        }
        else if(m>50 && m<=60){
            System.out.println("CD");
        }
        else if(m>40 && m<=50){
            System.out.println("DD");
        }
        else if(m<=40){
            System.out.println("FAIL");
        }
        else{
            System.out.println("Please enter a number under 100");
        }
    }
}
