package com.skl.com.skl.TestOOP6;

public interface TestInterface01 {
    public static final int NUM=100;
    public abstract void a();
    public abstract void b(int num);
    public abstract int c(String name);

}
interface TestInterface02{
    void e();
    void f();
}
class Student implements TestInterface01,TestInterface02 {
    public void e() {

    }

    @Override
    public void f() {

    }

    @Override
    public void b(int num) {

    }
    @Override
    public void a() {

    }

//    @Override
//    public void b(int num) {
//
//    }

    @Override
    public int c(String name) {
        return 0;
    }
}
class Test{
    public static void main(String[] args) {
        TestInterface02 t = new Student() ;
    }
}