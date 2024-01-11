package com.Akd;

public class NumbersEx {
    public static void main(String[] args) {
        //Write a fun that takes in a number and prints it
        //Print 1 2 3 4 5
        //You can call the function only once
        fnn(1);
    }
    static void fnn(int n){
        if(n==5){ //Base condition
            System.out.println(n);
            return;  //Termination
        }
        System.out.println(n);
        fnn(n+1); // Recursion
        //Each recursive call can be visualised as a separate function call in the stack
        //Tail Recursion
        //Cuz Last statement is a single recursive call
    }
}
