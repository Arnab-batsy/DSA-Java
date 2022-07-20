package com.arnab;

import java.util.Scanner;

public class Palli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
if(Pallindrome(a)){
    System.out.println("It is a pallindrome");
}
else{
    System.out.println("Not a pallindrome");
}
    }
    public static boolean Pallindrome(String a){
        String b="";
        int l= a.length();
        for(int i=l-1;i>=0;i--){
            b= b+ a.charAt(i);
        }
        if(b.equals(a)){
            return true;
        }
        else{
            return false;
        }
    }
}
