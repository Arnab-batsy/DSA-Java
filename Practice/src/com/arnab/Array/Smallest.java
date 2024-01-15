package com.arnab.Array;
//Problem Statement: Given an array, we have to find the smallest and largest element in the array.

public class Smallest {
    public static void main(String[] args) {
        int[] arr= {2,5,15,3,98,10,7,9};
        System.out.println(smallest(arr));
        System.out.println(greatest(arr));
    }

    private static int smallest(int[] arr) {
//        Arrays.sort(arr);
        int min= arr[0];
        for (int j : arr) {
            if (min > j)
                min = j;
        }
        return min;
    }
    private static int greatest(int[] arr) {
        int max= arr[0];
        for (int j : arr) {
            if (max < j)
                max = j;
        }
        return max;
    }
}
