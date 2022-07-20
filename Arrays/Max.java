package com.arnab;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 6, 5, 25, 36, 2, 17};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,3));
    }
    //For max value
    static int max(int[] arr){
        if (arr==null)
            return -1;
        if (arr.length==0)
            return -1;
        int max= arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    //For max in a range
    static int maxrange(int[] arr, int start, int end){
        if (arr.length==0)
            return -1;
        int max= arr[start];
        for(int i=start+1;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
