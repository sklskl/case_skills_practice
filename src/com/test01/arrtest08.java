package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest08
 * @author: skl
 * @create: 2024-04-25 14:57
 */
public class arrtest08 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
