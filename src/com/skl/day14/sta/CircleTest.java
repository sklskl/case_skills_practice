package com.skl.day14.sta;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle();
        Circle circle3 = new Circle(3.1);
        System.out.println("circle1 ID:"+circle1.getId());
        System.out.println("circle2 ID:"+circle2.getId());
        System.out.println("circle3 ID:"+circle3.getId());
        System.out.println("创建的个数："+Circle.getTotal());
    }
}
class Circle{
    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;

    public Circle(){
        id = init++ ;
        total++;
    }
    public Circle(double radius){
        this();
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getTotal() {
        return total;
    }
}