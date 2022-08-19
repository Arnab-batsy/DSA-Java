package com.arnab.Singleton;

public class Single {
    private Single() {
    }
    private static Single instance;
    public static Single getInst(){
        if(instance== null){
            instance= new Single();
        }
        return instance;
    }
}
class Main{
    public static void main(String[] args) {
        Single obj1 = Single.getInst();
        Single obj2 = Single.getInst();
        Single obj3 = Single.getInst();
//They point towards the same object
    }
}

