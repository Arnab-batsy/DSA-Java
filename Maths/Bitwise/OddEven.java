package com.arnab.Bitwise;

//Take a number and display it's even or odd
public class OddEven {
    public static void main(String[] args) {
        check(6444558);
    }
    static void check(int n){
        //Internally all the values are stored in binary
        //When a number is represented in binary, only the last digit represents whether its even or odd
        //Cuz all the other digits are powers of 2.
        //If last digit is 1 then it's odd else it's even
        //If we AND the number with 000..001 then we'll get the last digit.
        //Cuz AND with 11..11 gives the same number and doing AND with 00..00 gives 0000

        //the Last digit is known as LSB- Least Significant Bit
        if((n&1)==1){
            System.out.println("Odd");
        }
        else{
            System.out.println("Even");
        }
    }
}
