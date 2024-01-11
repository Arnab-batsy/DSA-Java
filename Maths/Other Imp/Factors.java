package com.arnab.Maths;
//find the factors of a given number

import java.util.ArrayList;

public class Factors {
    public static void main(String[] args) {
       int n= 40;
//       factorsBrute(n);
//       factorsOpti(n);
       factorsOptiSorted(n);
    }
//O(N)
    private static void factorsBrute(int n) {
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
//    O(sqrt(N))
    public static void factorsOpti(int n){
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                if(i*i==n){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " " + n / i + " ");
                }
            }
        }
    }
    //Both time and space will be sqrt(N)
    public static void factorsOptiSorted(int n){
        ArrayList<Integer> list= new ArrayList<Integer>();
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                if(i*i==n){
                    System.out.print(i+" ");
                }
                else {
                    System.out.print(i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
