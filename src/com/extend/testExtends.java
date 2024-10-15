package com.extend;

/**
 * @program: case_skills_practice
 * @ClassName: testExtends
 * @author: skl
 * @create: 2024-10-14 11:22
 */
public class testExtends {
    class Employee {
        private String name;
        private double salary;
        private double hireDay;

    }

    class Manager extends Employee {
        private double bonus;

        public Manager(double bonus) {
            this.bonus = bonus;
        }

        public double getBonus() {
            return bonus;
        }

        public void setBonus(double bonus) {
            this.bonus = bonus;
        }
    }
}
