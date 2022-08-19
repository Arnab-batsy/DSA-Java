package com.arnab;
//Find the minimum number of an array
public class Minimumno {
    public static void main(String[] args) {
        int[] arr = {12, 1, 25, 3, 0, -6, -20, 7};
        System.out.println(min(arr));
    }
    public static int min(int[] arr){
        int m= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(m>arr[i]){
                m=arr[i];
            }
        }
        return m;
    }
}
