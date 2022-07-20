package com.arnab;
import java.util.Scanner;
public class greet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your name");
        String name= sc.next();
        String a= pqr(name);
        System.out.println(a);
    }
    static String pqr(String greet){
        String l= "Hello "+ greet+ " How are you?";
        return l;
    }
    static String abc() {
        String s= "Hello, How are you?";
        return s;
    }
}
