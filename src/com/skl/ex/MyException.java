package com.skl.ex;
//运行时异常
public class MyException extends RuntimeException{
    int a=0;
    static final long serialVersionUID = -703489719074L;

    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }
}
