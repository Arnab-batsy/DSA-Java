package com.arnab.Properties.Inheritance;

public class BoxWeight extends Box{
    double wt;
    //Normal constructor
    public BoxWeight() {
        this.wt = -1;
    }
    //Constructor calling the instance variables of the base class
    public BoxWeight(double l, double w, double h, double wt) {
        super(l, w, h);
        //Used to call the parent constructor and initialise the values
        this.wt = wt;
    }
}
