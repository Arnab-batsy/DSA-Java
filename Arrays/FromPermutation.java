package com.arnab;

import java.util.Arrays;
import java.util.Scanner;

public class FromPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Taking input
        int l = sc.nextInt();
        int[] nums = new int[l];
        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }

        int length = nums.length; //For Leetcode question. I'm not an idiot.
        int[] ans = new int[length];
        for (int i=0;i<length;i++){
            ans[i]=nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));

    }
}
