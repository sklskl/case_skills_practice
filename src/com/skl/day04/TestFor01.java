package com.skl.day04;

/*
 * 百钱百鸡
 * 公鸡5文一只    x
 * 母鸡3文一只    y
 * 小鸡1文三只    z
 * 5x+3z+z/3=100
 * x+y+x=100
 * */
public class TestFor01 {
    public static void main(String[] args) {
        for (int x = 1; x <= 19; x++) {
            for (int y = 1; y <= 31; y++) {
                int z = 100 - x - y;
                if ((5 * x + 3 * y + z / 3 == 100) && (z % 3 == 0)) {
                    System.out.println("公鸡:" + x + ",母鸡:" + y + ",小鸡:" + z);

                }
            }
        }
    }
}
