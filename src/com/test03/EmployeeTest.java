package com.test03;

/**
 * @program: case_skills_practice
 * @ClassName: EmployeeTest
 * @author: skl
 * @create: 2024-05-06 14:57
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employees = new Employee();
        employees.setName("skl");
        employees.setId(1);
        employees.setSalary(1000);
        employees.setAge(18);
        employees.setBirthday(new MyDate(1999,5,6));
        System.out.println(employees);
    }
}
