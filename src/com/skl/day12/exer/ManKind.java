package com.skl.day12.exer;

public class ManKind {
    private int sex;
    private int salary;
    public void manOrWomen() {
        if (sex == 1){
            System.out.println("man");
        }else if (sex == 0){
            System.out.println("woman");
        }
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void employeed(){
        if(salary == 0){
            System.out.println("no job");
        }else if(salary ==1){
            System.out.println("have job");
        }
    }

}
