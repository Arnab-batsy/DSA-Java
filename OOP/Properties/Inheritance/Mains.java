package com.arnab.Properties.Inheritance;

public class Mains {
    public static void main(String[] args) {
        BoxWeight b1= new BoxWeight();
        BoxWeight b2= new BoxWeight(2,4,5,9);
        System.out.println(b1.h + b1.w);
        System.out.println(b2.h+" "+b2.wt);
        Box b5= new BoxWeight(2,6,5,8);
        //System.out.println(b5.wt);
       // It'll show error cuz the type of the reference variable is the determining factor
    }
}
