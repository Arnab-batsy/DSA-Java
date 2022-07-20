package com.condi_n_loop;
//ques: Check whether the input character is Uppercase or Lowercase
import java.util.Scanner;
public class Casecheck {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch= sc.next().trim().charAt(0);
        // .trim() trims out the empty spaces at the begining and the end of the String
        if(ch>= 'a' && ch<= 'z')
        {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }
    }
}
