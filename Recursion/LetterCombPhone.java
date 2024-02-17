package com.Akd.InterviewQues;
//Google Question
//Letter Combinations of a Phone number
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

import java.util.ArrayList;
import java.util.List;

//Taking a simplified combination-
//1- abc
//2- def
//3- ghi
//4- jkl
//5- mno
//6- pqr
//7- stu
//8- vwx
//9- yz

public class LetterCombPhone {
    public static void main(String[] args) {
        String s= "23";
        System.out.println(letterCombinations("",s));
        System.out.println(padCount("",s));
    }
    public static List<String> letterCombinations(String p,String up) {
        if(up.isEmpty()){
            List<String> li= new ArrayList<>();
            li.add(p);
            return li;
        }
        int a= up.charAt(0)- '0'; //This converts '2' into 2
        ArrayList<String> store= new ArrayList<>();
        //For any number, the range is from- [(number-1)*3, (number)*3)

        for(int i=(a-1)*3; i<a*3; i++){
          char ch= (char)('a'+i);
          store.addAll(letterCombinations(p+ch,up.substring(1)));
        }
        return store;
    }
    //Returning the count
    public static int padCount(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count= 0;
        int a= up.charAt(0)- '0'; //This converts '2' into 2

        for(int i=(a-1)*3; i<a*3; i++){
            char ch= (char)('a'+i);
            count= count + padCount(p+ch,up.substring(1));
        }
        return count;
    }
}
