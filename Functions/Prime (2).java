package com.arnab;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        check(a);
    }
    static void check(int a){
        int t=1;
        if(a<=1){
            System.out.println("Neither Prime nor composite");
            t=2;
        }
        for(int i=2;i*i<=a;i++){
if(a%i==0){
    t=3;
    break;
}
    }
        if(t==1) {
            System.out.println("Prime");
        }
        else if(t==3){
            System.out.println("Not Prime");
        }
    }
}
