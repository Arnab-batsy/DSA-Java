package com.arnab.Bitwise;
//Given an array in which all the other numbers appear twice except one number find that number
//Ex- [2,3,4,1,2,1,3,6,4]
//Here ans-6 Cuz it appears only once

public class ArrayFind {
    public static void main(String[] args) {
        //We know a^0=a
        //and a^a=0
        //XOR the entire array. Duplicate elements will lead to 0 and only remaining element will be the ans.
        //Associative Property
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int a=arr[0];
        for(int i=1;i<arr.length;i++){
            a= arr[i]^a;
        }
        System.out.println(a);
    }
}
