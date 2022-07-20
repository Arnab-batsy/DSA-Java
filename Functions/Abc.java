package com.arnab;
import java.util.Scanner;

public class Abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(Factorial(a));
    }
    static int Factorial(int a){
        int k=1;
        if(a==0 || a==1){
            return 1;
        }
        for(int i=2;i<=a;i++){
            k=k*i;
        }
        return k;
    }
}
