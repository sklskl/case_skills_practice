package com.skl.day15.interfa;

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED );
    }

}
interface Flyable{
    //全局常量
    public static final int MAX_SPEED = 7900;
    public static final int MIN_SPEED=1;
    //抽象方法
    public abstract void fly();
    public abstract void stop();

}
class Plane implements Flyable{
    @Override
    public void fly() {
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop() {
        System.out.println("通过驾驶员减速停止");

    }
}