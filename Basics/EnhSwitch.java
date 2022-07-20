package com.arnab;
//Ques: Enter a number from 1 o 7 and display the day of the week
import java.util.Scanner;
public class EnhSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number  to 7");
        int a= sc.nextInt();
//        switch (a) {
//            case 1 -> System.out.println("Monday");
//            case 2 -> System.out.println("Tuesday");
//            case 3 -> System.out.println("Wednesday");
//            case 4 -> System.out.println("Thursday");
//            case 5 -> System.out.println("Friday");
//            case 6 -> System.out.println("Saturday");
//            case 7 -> System.out.println("Sunday");
//            default -> System.out.println("Please Enter 1 to 7");
//        }
        switch (a) {
            case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
            case 6, 7 -> System.out.println("Weekend");
            default -> System.out.println("Please Enter 1 to 7");
        }
        }
    }
