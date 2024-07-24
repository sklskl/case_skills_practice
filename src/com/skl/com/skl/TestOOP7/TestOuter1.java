package com.skl.com.skl.TestOOP7;

public class TestOuter1 {
    public void method(){
        int num=10;

        class A{

        }
    }
    public Comparable method2(){
        class B implements Comparable{
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        }
        return new B();
    }
}
