package com.arnab.Questions;
//https://leetcode.com/problems/valid-palindrome/description/
//Working only for Letters
public class ValidPallindrome {
    public static void main(String[] args) {
        String a= "0P";
        System.out.println(palli(a));
    }
    public static boolean palli(String s) {
        s=s.toLowerCase();
        StringBuilder a= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if((int)(s.charAt(i))<=122 && (int)(s.charAt(i))>=97)
                a.append(s.charAt(i));
        }
        int start=0;
        int end= a.length()-1;
        boolean check= true;
        int i=0;
        while(start<=end){
            if(a.charAt(start)==a.charAt(end)){
                start++;
                end--;
            }
            else{
                check=false;
                break;
            }
            i++;
        }
        return check;
    }
}