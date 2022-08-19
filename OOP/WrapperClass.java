package com.arnab;

import java.sql.SQLOutput;

public class WrapperClass {
    public static void main(String[] args) {
        Integer p= 45;
        Integer q= 56;
        //Storing a as an object
        int b= 3;
        int c= 4;
        //Storing the values as primitives
        swap(b,c);
        System.out.println(b+" "+c);
        //It will not swap b and c
        //In case of primitives in java it is always pass by value
        //Primitives are stored in the heap memory
        //Won't change even in case of Integer type cuz the class is final

        abc ob1;
        for (int i=0;i<100000000;i++){
            ob1= new abc();
        }

    }
    static void swap(int a, int b){
        int temp=a;
        a=b;
        b= temp;
//        Swapping is only inside this function
    }
    static class abc{
        final int a=3;
        String b= "Akd";
        //You cannot interfere in garbage collection
        //But you can ask java to do or display something during garbage collection
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Memory is being freed");
        }
    }
}
