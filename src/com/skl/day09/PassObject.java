package com.skl.day09;


public class PassObject {
    public void peintAreas(Circle c, int time){
        System.out.println("radius \t \t area");
        //设置半径
        for (int i = 0; i <=time; i++) {
            c.radius = i;

        }
    }

}
