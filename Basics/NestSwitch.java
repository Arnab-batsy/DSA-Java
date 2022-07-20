package com.arnab;
import java.util.Scanner;
public class NestSwitch {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int id= in.nextInt();
        String dept= in.next();
        switch (id) {
            case 1 -> {
                System.out.println("Arnab Kumar Das");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Please enter a valid Department");
                }
            }
            case 2 -> {
                System.out.println("Shubhankar Das");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Please enter a valid Department");
                }
            }
            case 3 -> {
                System.out.println("Sarthak Dey");
                switch (dept) {
                    case "IT" -> System.out.println("IT Department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("Please enter a valid Department");
                }
            }
            default -> System.out.println("Enter Correct ID");
        }
    }
}
