package com.Akd;

public class BinarySearchRec {
    public static void main(String[] args) {
        int[] arr = {-3, 0, 2, 5, 8, 9, 15, 21};
        int ans = bs(arr, 8, 0, (arr.length - 1));
        System.out.println(ans);
    }

    public static int bs(int[] arr, int target, int s, int e) {
        //Need to pass s and e since we want to pass them in the future recursive calls. Else it would be impossible to divide the array
        if (s > e) {
            return -1; //element Not found. Make sure it's of the type of the function
        }
        int mid = s + (e - s) / 2; //mid is important to this call only so it's passed in the body

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return bs(arr, target, mid + 1, e);
            //Make sure you're returning the values that you get from sub recursion calls
        } else {
            return bs(arr, target, s, mid - 1);
        }
    }
}
