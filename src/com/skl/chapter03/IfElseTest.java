package com.skl.chapter03;

public class IfElseTest {
    public static void main(String[] args) {
        int heartBeats = 89;
        if (heartBeats<60 && heartBeats >80){
            System.out.println("你需要做进一步检查");
        }
        System.out.println("体检结束");
    }
}
