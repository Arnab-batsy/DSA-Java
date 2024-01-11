package com.arnab.Maths;
//HCF*LCM=a*b

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(54,48));
    }
    public static int hcf(int a, int b){
        if(a==0){
            return b;
        }
        return hcf((b%a),a);
    }
    private static int lcm(int a, int b) {
        return (a*b)/hcf(a,b);
    }
}
