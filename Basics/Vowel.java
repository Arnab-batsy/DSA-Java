package com.arnab;
//Program to check vowel or consonant
import java.util.Scanner;
public class Vowel {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the Character");
        String s= sc.next();
        char c= s.toLowerCase().trim().charAt(0);
        if(c== 'a' || c=='e' || c=='i'|| c=='o'|| c=='u'){
            System.out.println("It is a vowel");
        }
        else{
            System.out.println("It is a consonant");
        }
    }
}
