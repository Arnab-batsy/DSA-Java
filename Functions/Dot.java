package com.arnab;
import java.util.Scanner;

public class Dot {
    public static void main(String[] args) {
    int ans= sum3(25,35);
        System.out.println(ans);
    }
    static int sum3(int a, int b){
        int sum= a+b;
        return sum;
    }
    static int sum2(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n1= sc.nextInt();
        System.out.println("Enter another number");
        int n2= sc.nextInt();;
        int s= n1+n2;
        return s;
//        System.out.println("This statement will never be executed");
//        Cuz return statement is always the end of the function
    }
    static void sum() {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number");
        int n1= sc.nextInt();
        System.out.println("Enter another number");
        int n2= sc.nextInt();;
        int s= n1+n2;
        System.out.println("The Sum is "+s);
    }
}
