package com.test01;

/**
 * @program: case_skills_practice
 * @ClassName: arrtest09
 * @author: skl
 * @create: 2024-04-26 10:05
 */
public class arrtest09 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 25;
        int head = 0;
        int end = arr.length - 1;
        while (head <= end) {
            int mid = (head + end) / 2;
            if (arr[mid] == target) {
                System.out.println("找到了" + target + "的下标为：" + mid);
                break;
            } else if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                head = mid + 1;
            } else {
                System.out.println("没有找到" + target);
            }
        }

    }
}
