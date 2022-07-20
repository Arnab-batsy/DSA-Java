package com.arnab;

public class Shadowing {
    static int x= 90; // This will be shadowed at line 7
    public static void main(String[] args) {
        System.out.println(x); //90
        int x= 30;
        System.out.println(x); //30
        fun(); //90 Since the function fun is outside the scope of x at line 7
        fun2();
    }
    public static void fun() {
        System.out.println(x);
    }
    public static void fun2() {
        int x; //Declaring  //x shadows the class variable from here itself
        // System.out.println(x); It will show error cuz the scope begins when the variable is initialised
        x=50; //Initialising
    }
}
