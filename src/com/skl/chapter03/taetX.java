package com.skl.chapter03;


class HelloA{
    public HelloA(){
        System.out.println(" HelloAA");
    }
    static {
        System.out.println(" static A");
    }


}
public class taetX extends HelloA{
    public taetX(){
        System.out.println(" HelloB");
    }
    static {
        System.out.println(" static B");
    }
    public static void main(String[] args) {
        new taetX();
    }
}