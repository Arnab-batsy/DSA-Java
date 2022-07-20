package com.arnab;

import java.util.Scanner;

public class Pytha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
check(a,b,c);
    }
    static void check(int a, int b, int c){
if((((a*a)+(b*b))==(c*c))||(((a*a)+(c*c))==(b*b))||(((c*c)+(b*b))==(a*a))){
    System.out.println("Pythagorian triplet");
}
else{
    System.out.println("No");
}
    }
}
