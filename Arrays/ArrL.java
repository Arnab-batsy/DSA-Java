package com.arnab;
import java.util.ArrayList;
public class ArrL {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(10);
        arr.add(2225);
        arr.add(278);
        arr.add(22);
        arr.add(202);
        arr.add(365);
        arr.add(25);
        arr.add(100);
        System.out.println(arr);

        //To display a specific number of items, we use get keyword
        for(int i=0;i<5;i++){
            System.out.println(arr.get(i));
        }
    }
}
