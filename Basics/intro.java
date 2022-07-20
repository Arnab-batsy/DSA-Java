package com.arnab;
//ques: Enter fruit names and display characteristics
import java.util.Scanner;
public class intro {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name of the fruit");
        String fruit= sc.next();

        switch (fruit)
        {
            case "mango":
                System.out.println("The king of all fruits");
                break;
            case "apple":
                System.out.println("A sweet red fruit");
                break;
            case "banana":
                System.out.println("A yellow long fruit");
                break;
            case "orange":
                System.out.println("Has the same color as the name");
                break;
            default:
                System.out.println("Please Enter a valid fruit");
        }

    }
}
