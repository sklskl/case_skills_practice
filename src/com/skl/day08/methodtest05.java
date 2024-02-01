package com.skl.day08;

import com.sun.xml.internal.bind.v2.model.core.ID;

public class methodtest05 {
    int id;
    static int sid;
    public void a(){
        System.out.println(id);
        System.out.println(sid);
        System.out.println("-----a");
    }
    public static void b(){
        methodtest05 m = new methodtest05();
        System.out.println(m.id);
        //静态方法中，不能访问非静态的属性
        System.out.println(sid);
        System.out.println("-----b");
    }

    public static void main(String[] args) {
        b();
    }
}
