package com.arnab.p2;

public class InnerClasses {
    static class Test{
        String name;
        public Test(String name) {
            this.name = name;
        }
        @Override   //annotations
        public String toString() {  //Calling the toString Function
            return name;
        }
    }

    public static void main(String[] args) {
        Test a= new Test("Arnab");
        System.out.println(a); //name is being printed since Test has a toString method
    }
}
