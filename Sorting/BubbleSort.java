package com.arnab.algos;
//Aka sinking sort/ Exchange sort
//Stable sorting algorithm i.e., original order is maintained
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 6, 7, 9, 25};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        boolean swapped;
        //Run the steps N-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    //Swap
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    //If swap is taking place
                    swapped = true;
                }
            }
            //If you did not swap for a particular value of i that means the array is sorted
            //Break the loop (Optimization)
            if (!swapped) break;
        }
    }
}
