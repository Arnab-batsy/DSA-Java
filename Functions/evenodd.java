package com.arnab;
import java.util.Scanner;
public class evenodd {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        check(a);
    }
    static void check(int a){
        if(a%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
    }
