package com.arnab.Maths;
import java.lang.Math;
//Finding square root of a number
//Newton Raphson Method
//sqrt(N)= (X + N/X)/2 where X= assumed square root and N= actual number
//Complexity= O(log N *f(N)) Very complex not req.

public class NewtonSqrt {
    public static void main(String[] args) {
        int n= 102;
        System.out.printf("%.3f",newtonSqrt(n)); //Pretty Printing
    }

    public static double newtonSqrt(int n) {
        double x =n; //Assumed value
        double root;
        while(true){
            root= 0.5*(x + (n/x));
            if(Math.abs(root-x)<1){
                break; //Minimizing error
            }
            x=root;
        }
        return root;
    }
}
