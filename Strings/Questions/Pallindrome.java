package com.arnab.Questions;

public class Pallindrome {
    public static void main(String[] args) {
        //Taking a start and end pointer and shifting their position along with the loop
        String a= "Debalina";
        System.out.println(palli(a));
    }
    public static boolean palli(String a){
        if(a== null || a.length()==0){
            return true;
            //To avoid Null Pointer Exception
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
