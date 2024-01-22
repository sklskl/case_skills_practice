package com.skl.day06;

import com.sun.jmx.snmp.SnmpUnknownModelException;
import org.junit.internal.runners.statements.FailOnTimeout;
import sun.security.util.Length;

import java.util.Scanner;

public class TestMethod01 {
    public static void main(String[] args) {
        int[]scores = new int[10];
        int sum =0;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.println("请输入第"+i+"个学生的成绩：");
            int score = sc.nextInt();
            scores[i-1]=score;
            sum += score;
        }
        System.out.println("学生总成绩为：" +sum);
        System.out.println("学生平均成绩为："+sum/ scores.length);
    }
}
