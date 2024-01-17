package com.Akd.Arrays;
//Linear Search

import java.util.ArrayList;
import java.util.Arrays;

public class Find {
    public static void main(String[] args) {
        int[] arr= {1,4,3,9,17,10,17};
        int target=17;
//        System.out.println(lSearch(arr,target,0));
//        System.out.println(find(arr,target,0));
//        System.out.println(findLast(arr,target,arr.length-1));
//        findAll(arr,target,0);
//        System.out.println(find2(arr,target,0, new ArrayList<>()));
        System.out.println(find3(arr,target,0));
    }


    private static int lSearch(int[] arr,int target, int i) {
        if(i== arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return lSearch(arr, target, ++i);
    }
    private static int findLast(int[] arr,int target, int i) {
        if(i== -1){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return findLast(arr, target, --i);
    }
    private static boolean find(int[] arr,int target, int i) {
        if(i== arr.length){
            return false;
        }
        return (arr[i]==target) || find(arr, target, ++i);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    private static void findAll(int[] arr,int target, int i) {
        if(i== arr.length){
            System.out.println(list);
            return;
        }
        if(arr[i]==target){
            list.add(i);
        }
        findAll(arr, target, ++i);
    }
    private static ArrayList<Integer> find2(int[] arr, int target, int i, ArrayList<Integer> l) {
        if(i== arr.length){
            return l;
        }
        if(arr[i]==target){
            l.add(i);
        }
        return find2(arr, target, ++i, l);
    }
    //Return the list but don't take it in argument
    private static ArrayList<Integer> find3(int[] arr, int target, int i) {
        ArrayList<Integer> li= new ArrayList<>();
        //Problem- New Objects are being created at every fn. call.
        if(i== arr.length){
            return li;
        }
        //This will contain answer for that fn call only
        if(arr[i]==target){
            li.add(i);
        }
        ArrayList<Integer> valueFromPrevCalls= find3(arr, target, ++i);
        li.addAll(valueFromPrevCalls);
        return li;
    }
}
