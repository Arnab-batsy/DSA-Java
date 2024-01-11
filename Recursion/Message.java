package com.Akd;

public class Message {
    public static void main(String[] args) {
        Message1();
        //You have to call only one function and print Hello world 5 times
    }
    static void Message1(){
        System.out.println("Hello World");
        //You can't write 5 print statements here
        Message2();
        //A function is calling another function.
    }
    static void Message2(){
        System.out.println("Hello World");
        Message3();
    }
    static void Message3(){
        System.out.println("Hello World");
        Message4();
    }
    static void Message4(){
        System.out.println("Hello World");
        Message5();
    }
    static void Message5(){
        System.out.println("Hello World");
    }
}
