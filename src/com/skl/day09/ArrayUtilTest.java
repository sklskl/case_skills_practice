package com.skl.day09;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = new int[]{32, 43,5,3 ,8,95,341,99,0,-43};
        int maxNum = arrayUtil.getMax(array);
        System.out.println("数组最大值："+maxNum );
        int sum = arrayUtil.getSum(array);
        System.out.println("数组总和："+sum );

    }
}
