package com.arnab;

import java.util.Random;
import java.util.Scanner;
public class Shantanu {
        public static void main(String[] args) {
            int uPoints = 0, cPoints = 0;
            System.out.println("WELCOME TO THE ROCK PAPER and SCISSORS GAME");
            System.out.println("Enter\nR --->> ROCK\nP --->> PAPER\nS --->> SCISSORS");
            for(int i=0; i<3; i++ )
            {
                Random rand = new Random();
                int c = rand.nextInt(3) + 1;
                System.out.print("Enter your Input -->> ");
                Scanner sc = new Scanner(System.in);
                String temp = sc.next();
                int u = 0;
                switch (temp) {
                    case "R" -> u = 1;
                    case "P" -> u = 2;
                    case "S" -> u = 3;
                    default -> System.out.println("ROUND CANCELLED due to Invalid input");
                }

                if (c == u) {
                    System.out.println("Computer choose -->> "+ temp);
                    System.out.println("Its a DRAW");
                    uPoints = uPoints+1 ; cPoints = cPoints+1;
                } else if (c == 1 && u == 2) {
                    System.out.println("Computer choose -->> ROCK");
                    System.out.println("Congratulations you have WON");
                    uPoints = uPoints + 1;
                }
                else if(c == 1 && u == 3) {
                    System.out.println("Computer choose -->> ROCK");
                    System.out.println("Computer Won");
                    cPoints = cPoints + 1;
                }
                else if(c == 2 && u == 3){
                    System.out.println("Computer choose -->> PAPER");
                    System.out.println("Congratulations you have WON");
                    uPoints = uPoints + 1;
                }
                else if(c == 2 && u == 1){
                    System.out.println("Computer choose -->> PAPER");
                    System.out.println("Computer Won");
                    cPoints = cPoints + 1;
                }
                else if(c == 3 && u == 1) {
                    System.out.println("Computer choose -->> SCISSORS");
                    System.out.println("Congratulations you have WON");
                    uPoints = uPoints + 1;
                }
                else if(c == 3 && u == 2){
                    System.out.println("Computer choose -->> SCISSORS");
                    System.out.println("Computer Won");
                    cPoints = cPoints + 1;
                }
                System.out.println("user = " + uPoints);
                System.out.println("Computer = " + cPoints);
            }
            if(uPoints>cPoints)
                System.out.println("User Won");
            else if(uPoints==cPoints)
                System.out.println("It's a DRAW");
            else
                System.out.println("Computer Won");
        }
    }
