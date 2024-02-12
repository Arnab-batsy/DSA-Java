package com.Akd.Subset;
//Find all the subsequences of the given string
//Subset- Arrays
//Subsequence- Strings
import java.util.ArrayList;

public class SubSeq {
    public static void main(String[] args) {
        String a= "abcd";
        System.out.println(subSeqRet("",a));
    }
    static void subSeq(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        char a= up.charAt(0);
        //Take it
        subSeq(p+a,up.substring(1));
        //Ignore it
        subSeq(p,up.substring(1));
    }
    static ArrayList<String> subSeqRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char a= up.charAt(0);
        //Take it
        ArrayList<String> left= subSeqRet(p+a,up.substring(1));
        //Ignore it
        ArrayList<String> right= subSeqRet(p,up.substring(1));
        left.addAll(right);
        return left;
    }
}
