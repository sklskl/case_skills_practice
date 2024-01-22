package com.skl.day15.Template;

public class TesplateTest {
    public static void main(String[] args) {
        SubTemplate tt = new SubTemplate();
        tt.spendTime();

    }
}
abstract class Template{
    public void spendTime(){
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println("花费的时间"+(end-start));
    }
    public abstract void code();
}
class SubTemplate extends Template{
    @Override
    public void code() {
        for (int i = 0; i < 100; i++) {
            boolean isFlag = true;
            for (int j = 1; j < Math.sqrt(i); j++) {
                if (i%j==0){
                    isFlag = false;
                    break;
                }
            }
            if (isFlag){
                System.out.println(i);
            }
        }
    }
}