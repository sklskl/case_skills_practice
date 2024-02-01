package com.skl.day08;

public class Student extends Person{
    private  int sno;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }
    public void studt(){
        System.out.println("学生特有方法：学习；");
    }
}
