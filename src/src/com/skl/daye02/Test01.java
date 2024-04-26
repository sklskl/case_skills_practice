package src.com.skl.daye02;

import java.util.Random;

//随机数
public class Test01 {
    public static void main(String[] args) {
//        System.out.println(Math.random());
//        //学习random类
//        Random r1 = new Random(System.currentTimeMillis());
//        int i1 = r1.nextInt();
//        System.out.println(i1);
        Random r1 = new Random();
        System.out.println(r1.nextInt(20));
    }
}
