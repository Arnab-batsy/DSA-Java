package com.arnab;

import java.util.Arrays;
//Call by Value
public class Abc {
    public static void main(String[] args) {
        int[] nums= {1, 3, 55, 20};
        System.out.println(Arrays.toString(nums));
    change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr){
        arr[0]=95;
    }
}
