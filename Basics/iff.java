package com.condi_n_loop;
import java.util.Scanner;
public class iff {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        Syntax
        if(boolean expression T or F) {
        body
        }
        else if(Another boolean expression) {
        statement
        }
        else {
        body
        }
         */

//        Example
        System.out.println("Enter your Salary");
        int salary= sc.nextInt();
        if (salary>20000)
        {
            salary+= 3000;
        }
        else if (salary>10000)
        {
            salary+= 3000;
        }
        else
        {
            salary+= 1000;
        }
        System.out.println("Your new Salary is"+ salary);
    }
}
