package com.Akd.Subset;
//Print the subsets along with their ASCII values

import java.util.ArrayList;

public class ASCII {
    public static void main(String[] args) {
        String s= "abc";
        ASCII ob= new ASCII();
//        ob.subSetASCII("",s);
        System.out.println(ob.subSetAsciiRet("",s));
    }
    public void subSetASCII(String p, String u){
        if(u.isEmpty()){
            System.out.print(p+" ");
            if(p.length()==1){
                System.out.print((p.charAt(0)+0)+" ");
            }
            return;
        }
        char ch= u.charAt(0);
        subSetASCII(p+ch,u.substring(1));
        subSetASCII(p, u.substring(1));
//        subSetASCII(p+(ch+0),u.substring(1));
    }
    public ArrayList<String> subSetAsciiRet(String p, String u){
        if(u.isEmpty()){
           ArrayList<String> list= new ArrayList<>();
           list.add(p);
           return list;
        }
        char ch= u.charAt(0);
        ArrayList<String> left= subSetAsciiRet(p+ch,u.substring(1));
        ArrayList<String> right= subSetAsciiRet(p, u.substring(1));
        ArrayList<String> straight= subSetAsciiRet(p+(ch+0),u.substring(1));
        left.addAll(right);
        left.addAll(straight);
        return left;
    }
}
