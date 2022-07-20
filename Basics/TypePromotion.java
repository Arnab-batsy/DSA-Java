package com.arnab;

public class TypePromotion {

    public static void main(String[] args) {
        //Automatic Type Promotion in Expressions
//        int a = 258;
//        byte b= (byte)(a);
//        System.out.println(b);
        //Max value that a variable with a byte datatype can store is 256
        //256 % 258 i.e., 2 will be stored in here
//
//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = a * b / c;
//        System.out.println(d);
        //the term a*b easily exceeds the range of byte data type.
        // byte*byte should give byte and 2000 can't be stored in it.
        //Java automatically promotes each byte term into an integer while evaluating the expression
        //i.e., a*b is performed using integers

//        byte x = 50;
////        x= x*2;
//        //Casting Error... can't assign integer value to byte datatype
//        System.out.println("অর্ণব");
        //Java follows unicode principles
//        int num = 'A';
//        System.out.println(num);
//        //Character A will be promoted to integer and print 65 i.e; corresponding ASCII value
//        System.out.println(2 * 7.5);
//    integer*float gives float value

        //example
        byte b= 25;
        char c= 'A';
        short s= 102;
        int i= 95;
        float f= 25.654f;
        double d= 456.369;
        double result= (f*b)+(i/c)-(d+s);
        System.out.println((f*b)+" "+(i/c)+" "+(d+s));
        //float+int-double gives double
        System.out.println(result);

    }
}
