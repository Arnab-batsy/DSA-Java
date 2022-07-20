package com.arnab;
import java.util.Arrays;

//Functions with the same name but different parameters
public class Overloading {
    public static void main(String[] args) {
       fun(5);
        fun("Arnab");
        fun(56,25);
        // demo(); Ambiguity: It will throw error cuz it can't decide which demo function to run since there are no arguments.
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name); //Either the type of argument should be different
    }
    static void fun(int b, int c){
        System.out.println(b+" "+c); //Or the number of arguments should be different
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
}
