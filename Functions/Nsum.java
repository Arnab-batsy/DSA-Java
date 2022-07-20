package com.arnab;

import java.util.Scanner;
public class Nsum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Sum is "+sum(a));
    }
    static int sum(int a){
        int s=0;
        for(int i=1;i<=a;i++){
            s=s+i;
        }
        return s;
    }
}
