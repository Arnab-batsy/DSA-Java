package com.arnab;

import java.util.Scanner;

public class Primerange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
int a= sc.nextInt();
int b=sc.nextInt();
prime(a,b);
    }
    static void prime(int a, int b){
        for (int i=a;i<=b;i++){
            int t=1;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    t++;
                    break;
                }
            }
            if(t==1 && i!=1) {
                System.out.println(i);
            }
        }
    }
}
