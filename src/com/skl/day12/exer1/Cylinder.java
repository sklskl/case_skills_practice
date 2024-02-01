package com.skl.day12.exer1;


public class Cylinder extends Circle {
    private double length;

    public Cylinder() {
        length = 1.0;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }
    public double findVloume(){
        return Math.PI*getRadius()*getRadius()*getLength();
    }
}
