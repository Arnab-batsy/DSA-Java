package com.Akd.Permutations;
//Number of possible permutations for a string of size n is n!
//Number of recursive calls= size of processed +1
//Q- Print all the permutations of the given String

import java.util.ArrayList;

public class Premu {
    public static void main(String[] args) {
        String s= "abc";
//      permutaion("",s);
        System.out.println(permuRet("",s));
    }
    public static void permutaion(String p, String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        //Now I am making variable number of function calls that depend upon the size of processed
        char ch= up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f= p.substring(0,i);
            String s= p.substring(i);  //[0,0), [1,1) are nothing so they won't be a problem
            permutaion(f+ch+s,up.substring(1));
        }
    }
    public static ArrayList<String> permuRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch= up.charAt(0);
        ArrayList<String> store= new ArrayList<>(); //Local to this call

        for(int i=0; i<=p.length();i++){
            String f= p.substring(0,i);
            String s= p.substring(i);
            store.addAll(permuRet(f+ch+s,up.substring(1)));
        }
        return store;
    }
}
