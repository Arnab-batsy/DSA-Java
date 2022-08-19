package com.arnab;

public class ClassLearn {
    public static void main(String[] args) {
        Student s1 = new Student(04,"Arnab",92);
        //Calls the constructor with 3 arguments
        Student s2= new Student();
        //Calls the constructor with no arguments
        //Now it calls the default constructor with 3 arguments inside the empty constructor.
        Student other= new Student(s1);
        //Calls the constructor with object as argument

//        s1.greeting();
//s1.rno=04;
//s1.name="Arnab";
//s1.marks=92.0f;
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        //Default constructor
        System.out.println(s2.rno);
        System.out.println(s2.name);
        System.out.println(s2.marks);

        System.out.println(other.name);
        //Displays name of s1
    }

    static class Student {
        int rno;
        String name;
        float marks;

        //Constructor (special Function)
        //this keyword is used to access every object that you create
        Student(int roll, String nam, float mark) {
            this.rno = roll;
            this.name = nam;
            this.marks = mark;
//Every object that you create replaces the 'this' keyword
        }
//        Student(){
//            this.rno = 0;
//            this.name = "NA";
//            this.marks = 0;
//        }
//Constructor overloading
        Student(Student random){
            //taking Values from another object
            this.rno= random.rno;
            this.name= random.name;
            this.marks= random.marks;
        }
        Student(){
            //calling a constructor from another constructor
            this (4,"Arnab",0);
        }
        //Adding Functions
        void greeting() {
            System.out.println("Hello my name is " + this.name);
        }
    }
}
