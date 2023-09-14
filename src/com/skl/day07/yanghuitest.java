package com.skl.day07;

public class yanghuitest {
    public static void main(String[] args) {
        //声明一个二位数组
        int[][]yanghui = new int[10][];
        //赋值
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] =new int[i+1];
            //首末元素赋值
            yanghui[i][0]=1;
            yanghui[i][i]=1;
            //非首末元素赋值
            if (i>1){
                for (int j = 1;j<yanghui[i].length-1;j++){
                    yanghui[i][j]= yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }

        }
        //遍历
        for (int i = 0; i < yanghui.length; i++) {
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j]+"\t");
            }
            System.out.println();
        }

    }
}
