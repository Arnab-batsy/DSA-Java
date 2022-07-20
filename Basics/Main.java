package com.arnab;

import java.util.Scanner;
//importing the public class Scanner ti use it in our own file

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.print(1);
        System.out.print(2);
        //print doesn't add a new line

        Scanner input = new Scanner(System.in);
        //Creating a variable input that points towards the object of the Scanner class
        //It can use all the functions under the Scanner class
        //System.in reads standard default input from the keyboard

        System.out.println(input.nextInt());
        //The nextInt function reads the integer values
        System.out.println(input.next());
        //The next function reads all the characters as a string until it finds a space
        System.out.println(input.nextLine());
        //The nextLine function reads the whole line as a String
        double a= input.nextDouble();
        //Stores a Double value
       float b= input.nextFloat();
        System.out.println(a+b);
    }
}