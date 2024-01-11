package com.arnab.Maths;
//Find the Square root of a number
//Binary Search Approach
//Time Complexity= O(log N)

public class Sqrt {
    public static void main(String[] args) {
        int n= 102;
        int p=3; //Precision value
        System.out.printf("%.3f",binarySqrt(n,p)); //Pretty Printing
    }

    public static double binarySqrt(int n, int p) {
        int start= 0, end=n;
        double root= 0.0;

        while(start<=end) {
            int mid = start + (end - start) / 2;
            if( mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        root=end;
        //Now for precision
        double incr=0.1;
        for (int j = 0; j < p; j++) {
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
        return root;
    }
}
