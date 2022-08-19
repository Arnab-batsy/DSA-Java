package com.arnab.p2;

public class Static {
    static int a=4;
    static int b;
    static{
        //Will only run once i.e., when the first object is created, when the class is loaded for the first time
        System.out.println("It's a static block");
        b=a*5;
    }
    public static void main(String[] args) {
        Static obj= new Static();
        System.out.println(Static.a+" "+Static.b);
        Static.b+=3;
        System.out.println(Static.a+" "+Static.b);
        Static obj2= new Static();
        //Class is being called for the 2nd time. static block won't run now.
        System.out.println(Static.a+" "+Static.b);

    }
}
