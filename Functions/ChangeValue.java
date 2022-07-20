package com.arnab;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
       //Create an array
        int[] arr= {2,4,78,91,23,3};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]= 99;
        // Here new object isn't created.
        // The original object is modified and the variables arr and nums both points towards the same object.
    }
}
