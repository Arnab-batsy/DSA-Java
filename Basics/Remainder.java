package com.condi_n_loop;
//Ques: Print theeverse of a number
import java.util.Scanner;
public class Remainder {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int num= n;
        int count = 0;
        while (num != 0) {
            num = num / 10;
            ++count;
        }
        int newn=0;
        for(int i=0; i<count; i++)
        {
            int a= n%10;
            n=n/10;
            newn= (newn*10) + a;
        }
        System.out.println(newn);
    }
}
