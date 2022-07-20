package com.arnab;
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
fun(1,4,56,90,76,4,5,6,7,89,30);
multiple(2,65,"Arnab","Kunal","Swagata","Babusona","Bendu");
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a+","+b+","+Arrays.toString(v));
    }
    static void fun(int ...v) { // ...v is variable length argument i.e., takes any number of inputs you want
        System.out.println(Arrays.toString(v));
    }
}
