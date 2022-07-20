package com.arnab;

public class LoopScope {
    public static void main(String[] args) {
        int a= 10;
        for (int i=1; i<=10; i++){
            System.out.println(i);
            int num=2;
          //  int a= 90;  Will show error cuz it's already initialised outside the loop scope.
        a=90; //Changing of value
        }
       // System.out.println(i);
        //Can't use i outside the scope cuz it is initialised inside the scope.
        System.out.println(a);
        //value of a can be changed universally inside the scope and hence it will print 90.
        int num=6;
        //Anything that is initialised inside the scope of the loop can definitely be initialised outside again.
        //But can't be used outside unless initialised again.
    }
}
