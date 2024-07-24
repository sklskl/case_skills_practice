package src.com.skl.day10.team.service;

import src.com.skl.day10.team.domain.*;


import java.util.Arrays;

import static src.com.skl.day10.team.service.Data.*;


/**
 * @program: case_skills_practice
 * @ClassName: NameListService
 * @author: skl
 * @create: 2024-07-02 13:47
 * @description: 负责将Data中的数据构建成Employee数组，同时提供相关操作employee的方法
 */
public class NameListService {

    private Employee[] employees;

    public NameListService() {
        employees = new Employee[EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);//员工的类型
            //获取通用的属性
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);
            Equipment equipment;
            double bonus ;
            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = createEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary,equipment);
                    break;
                case Data.DESIGNER:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary,equipment,bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = createEquipment(i);
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary,equipment,bonus,stock);
                    break;
            }

        }
    }

    private Equipment createEquipment(int index) {
        int equipmentType = Integer.parseInt(EQUIPMENTS[index][0]);
        String model = EQUIPMENTS[index][1];
        String priceorDispalyorTypedisplay = EQUIPMENTS[index][2];
        switch (equipmentType) {
            case PC:
                return new PC(model, priceorDispalyorTypedisplay);
            case NOTEBOOK:
                double price = Double.parseDouble(priceorDispalyorTypedisplay);
                return new NoteBook(model, price);
            case PRINTER:
                return new Printer(model, priceorDispalyorTypedisplay);

        }
        return null;
    }

    public Employee[] getAllEmployees() {

        return employees;
    }
//获取制定id对应的员工
    public Employee getEmployee(int id) throws TeamException{
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }//
        throw new TeamException("找不到指定员工");
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "NameListService{" +
                "employees=" + Arrays.toString(employees) +
                '}';
    }
}
