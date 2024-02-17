package com.Akd.InterviewQues;
//Q- You have a dice. How many ways are there to form a sum x.
//There can be any number of throws
//Better Question- https://leetcode.com/problems/number-of-dice-rolls-with-target-sum/description/

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
//        dice("",4);
//        System.out.println(diceRet("",5));
//        System.out.println(diceFace("",9,8));
        System.out.println(diceFaceCount("",500,30,30));
    }
    public static void dice(String p, int up){
        if(up==0){
            System.out.print(p+" ");
            return;
        }
        for (int i = 1; i <=6 && i<=up; i++) {
            dice(p+i,up-i);
        }
    }
    public static List<String> diceRet(String p, int up){
        if(up==0){
            List<String> li= new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> store= new ArrayList<>();
        for (int i = 1; i <=6 && i<=up; i++) {
            store.addAll(diceRet(p+i,up-i));
        }
        return store;
    }
    //When the die has n faces.
    public static List<String> diceFace(String p, int up, int face){
        if(up==0){
            List<String> li= new ArrayList<>();
            li.add(p);
            return li;
        }
        ArrayList<String> store= new ArrayList<>();
        for (int i = 1; i <=face && i<=up; i++) {
            store.addAll(diceFace(p+i,up-i,face));
        }
        return store;
    }
//When the die has k faces and n throws. Count solutions
    public static int diceFaceCount(String p, int up, int face, int t){
        //Only returning when up is empty and processed has throws equal to the given number of throws
        if(up==0 && p.length()==t){
            return 1;
        }
        int count= 0;
        //Optimizing. If no. of throws exceed the given no. of throws, no need to compute just return 0.
        if(p.length()>t){
            return 0;
        }
        for (int i = 1; i <=face && i<=up; i++) {
            count= count + diceFaceCount(p+i,up-i,face,t);
        }
        return count;
    }
}
