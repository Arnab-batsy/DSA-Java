package com.Akd;

//Space Complexity= O(n)- Path of the tree (Height)
public class FibonacciRecursion {
    public static void main(String[] args) {
        System.out.println(fibo(6));
        //Program will get stuck if bigger number is given as input
        //Since Linear Recurrence relations are very slow
        for (int i=0;i<8;i++){
            System.out.println(fiboformula(i));
        }
    }
    public static int fiboformula(int n){
        //Here, We'll calculate nth fibonacci number using the formula that we derived in notes
        return (int) ((Math.pow(((1+Math.sqrt(5))/2),n)-(Math.pow(((1-Math.sqrt(5))/2),n)))/Math.sqrt(5));
    }

    public static int fibo(int n) {
        if (n < 1) {
            System.out.println("Please enter a positive number > 1");
            return 0;
        }
        if (n == 1) { //Base Condition
            return 0;
        } else if (n == 2) { //Base Condition
            return 1;
        } else {
            return fibo(n - 1) + fibo(n - 2); //Recurrence Relation
            //Not Tail recursion due to extra step of addition and returning
        }
    }
}
