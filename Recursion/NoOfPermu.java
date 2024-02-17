package com.Akd.Permutations;
//return the number of times a given string can be permuted

public class NoOfPermu {
    public static void main(String[] args) {
        String s= "abcd";
        System.out.println(count("",s));
    }
    public static int count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int ct=0;
        char ch= up.charAt(0);
        for (int i = 0; i <=p.length() ; i++) {
            String f= p.substring(0,i);
            String s= p.substring(i);  //[0,0), [1,1) are nothing so they won't be a problem
            ct= ct +count(f+ch+s,up.substring(1));
        }
        return ct;
    }
}
