package com.arnab;
import java.util.Arrays;
import java.util.Scanner;

public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Taking input
        int l = sc.nextInt();
        int[] nums = new int[l];
        for (int i = 0; i < l; i++) {
            nums[i] = sc.nextInt();
        }

        int n= nums.length; //For Leetcode question. I'm not an idiot.
        int[] ans= new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
