package com.arnab;

public class Pretty {
    public static void main(String[] args) {
        //Formatted String stuff
        double a= 453.1325;
        System.out.printf("Formatted number is %.2f %n", a);
        //.2f= upto 2 decimal places
        //%n= newline
        System.out.printf("Pi value %.3f%n", Math.PI);
        //.3f= upto 3 decimal places
        System.out.printf("Hello my name is %s and I am %s", "Arnab","Cool");
        //%s= strings
//        https://stackabuse.com/how-to-format-a-string-in-java-with-examples/ Follow for more!
        //Basic Placeholders-
//                %c - Character
//                %d - Decimal number (base 10)
//                %e - Exponential floating-point number
//                %f - Floating-point number
//                %i - Integer (base 10)
//                %o - Octal number (base 8)
//                %s - String
//                %u - Unsigned decimal (integer) number
//                %x - Hexadecimal number (base 16)
//                %t - Date/time
//                %n - Newline
    }
}
