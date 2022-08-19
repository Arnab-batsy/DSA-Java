package com.arnab.Properties.Inheritance;

public class Box {
    double l;
    double w;
    double h;

    public Box() {
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }
//cube
    public Box(double side) {
        this.l = side;
        this.w = side;
        this.h = side;
    }
    //Cuboid
    public Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }
    //Copy constructor
    Box(Box old){
        this.l=old.l;
        this.w=old.w;
        this.h=old.h;
    }
    public void info(){
        System.out.println("Running");
    }
}
