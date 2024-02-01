package com.skl.day12.exer1;

public class Circle  {
    private double radius;

    public Circle() {
        radius = 1.0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    //面积
    public double findArea(){
        return Math.PI*radius*radius;
    }
}
