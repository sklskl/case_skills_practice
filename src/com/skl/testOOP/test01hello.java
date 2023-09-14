package com.skl.testOOP;

import java.util.Date;
import java.util.Properties;

public class test01hello {
    public static void main(String[] args) {
        System.out.println(new Date());
        Properties p = System.getProperties();
        p.list(System.out);
        System.out.println("--------");
        Runtime rt = Runtime.getRuntime();
        System.out.println("totla Mem="+rt.totalMemory());
        System.out.println("totla Mem="+rt.freeMemory());
    }
}
