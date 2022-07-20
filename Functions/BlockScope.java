package com.arnab;

public class BlockScope {
    public static void main(String[] args) {
        int a = 100;
        {
            // int a= 89; Already initialised outside the block in the same function.
            // Hence, you can not initialise again
            a = 56;
            // Reassign the original reference variable to some other value
            System.out.print(a); // will print 56
            int b = 90; // Values initialised in a block will remain in the block
        }
        System.out.println(a); // Will print 56 outside the block too cuz the original value is altered
        // System.out.println(b); b can't be used outside the block
    }
}