package com.skl.day06;

public class TestMethod03 {
    public static void main(String[] args) {
        int [] arr ={12,34,56, 7, 3, 10};
        int index;
        //          0  1   2  3   4   5
        for (int i = 0; i < arr.length; i++) {
            if (56==arr[i]){
                index=i;
                System.out.println("true,index:"+index);
            }else {
                System.out.println("false");
            }
        }
        //查询56对应的索引
    }
}
