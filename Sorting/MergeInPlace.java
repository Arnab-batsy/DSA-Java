package com.arnab.algos;

import java.util.Arrays;

public class MergeInPlace {
    public static void main(String[] args) {
        int[] arr= {5,4,3,1,2,9,7,6};
        mergeInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private static void mergeInPlace(int[] arr, int start, int end) {
        if(end-start==1){
            return;
        }
        int mid= (start+end)/2; //Dividing
        mergeInPlace(arr,start,mid);
        //Here mid is exclusive
        mergeInPlace(arr,mid,end);

        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int s, int m, int e) {
        int i=s;
        int j=m;
        int k=0;
        int[] mix= new int[e-s]; //Length should be +1
        while(i<m && j<e ){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        //It may be possible that traversing through one of the arrays is not complete.
        //In that case, copy the remaining elements
        while(i<m){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        //only one of these loops will run
        //Copying
        for (int l=0;l<mix.length;l++){
            arr[s+l]=mix[l];
        }
    }
}
