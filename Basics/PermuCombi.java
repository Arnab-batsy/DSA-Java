package com.arnab;
//nCr= n!/(n-r)!r!
//nPr= n!/(n-r)!
import java.util.Scanner;
public class PermuCombi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter n and r");
        int n= sc.nextInt();
        int r= sc.nextInt();
        int res= n-r;
        double a = 1.0,b = 1.0,c= 1.0;
        for(int i=1; i<=n; i++) {
            a=a*i;
        }
        for(int i=1; i<=res; i++) {
            b*=i;
        }
        for(int i=1; i<=r; i++) {
            c*=i;
        }
        double comb= a/(b*c);
        double perm= a/b;
        System.out.println(comb);
        System.out.println(perm);
    }
}
