package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest06 杨辉三角
 * @author: skl
 * @create: 2024-04-24 16:01
 */
public class arrtest06 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new int[i+1];
            arr[i][0]=arr[i][i]=1;
            for (int j = 1; j < arr[i].length-1; j++) {
                arr[i][j]=arr[i-1][j-1]+arr[i-1][j];

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]+"\t");

            }
            System.out.println();
        }

    }
}
