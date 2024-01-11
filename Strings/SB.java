package com.arnab;

public class SB {
    public static void main(String[] args) {
        //StringBuilder
        StringBuilder a= new StringBuilder();
        for (int i=0; i<26;i++){
            char ch= (char)('a'+i);
            a.append(ch);
            //Here new objects are not created and changes are made in the original object
        }
        System.out.println(a.toString());
        System.out.println(a.reverse());
    }
}
