package com.arnab;
import java.util.Scanner;
public class Stringrev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a= sc.next().trim();
int l= a.length();
String rev= " ";
for (int i=l-1; i>=0; i--)
{
    char c=a.charAt(i);
    rev= rev+c;
}
        System.out.println(rev.trim());
    }
}
