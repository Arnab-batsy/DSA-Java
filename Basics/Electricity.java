package com.arnab;
//Calculate Electricity Bill

//1 to 100 units – Rs. 10/unit
//100 to 200 units – Rs. 15/unit
//200 to 300 units – Rs. 20/unit
//above 300 units – Rs. 25/unit

import java.util.Scanner;
public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the units");
        int u = sc.nextInt();
        int bill= 0;
        if (u <= 100) {
            bill = u * 10;
        }
        else if( u>100 && u<=200){
            bill= 1000 + ((u-100)*15);
        }
        else if( u>200 && u<=300) {
            bill = 2500 + ((u - 200) * 20);
        }
        else {
            bill = 4500 + ((u - 300) * 25);
        }
        System.out.println("Your Electricity bill is "+bill);
    }
}
