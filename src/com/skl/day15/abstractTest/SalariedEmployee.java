package com.skl.day15.abstractTest;

public class SalariedEmployee extends Employee  {
    private double monthlySalary;
    @Override
    public  double earnings() {
        return monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyData birthday) {
        super(name, number, birthday);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
