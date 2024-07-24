package src.com.skl.day04;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @program: case_skills_practice
 * @ClassName: SequenceGen
 * @author: skl
 * @create: 2024-06-03 15:13
 */
public class SequenceGen {

    private static Map<String, Integer> departmentCounters = new HashMap<>();

    public static String getNextSequence(String deptName) {
        int counter = departmentCounters.getOrDefault(deptName, 0);
        counter++;
        departmentCounters.put(deptName, counter);
        return deptName + "-" + String.format("%03d", counter);
    }
    public static void main(String[] args) {
        SequenceGen sequenceGen = new SequenceGen();
        System.out.println(getNextSequence("skl"));
        System.out.println(getNextSequence("skl"));
        System.out.println(getNextSequence("skl"));
        System.out.println(getNextSequence("abc"));
        System.out.println(getNextSequence("abc"));
        System.out.println(getNextSequence("abc"));
    }
}
