package com.skl.day11.ui;

import com.skl.day11.service.CustomerList;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);
    /*
    * 显示页面操作
    * */
    public  void enterMainMenu(){
        CustomerView customerview = new CustomerView();
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("\n-----------客户信息管理软件-----------");
            System.out.println("             1、添加用户                ");
            System.out.println("             2、修改用户                ");
            System.out.println("             3、删除用户                ");
            System.out.println("             4、添加用户                ");
            System.out.println("             5、添加用户                ");
            System.out.print("            请选择（1-5）              ");
            isFlag = false;
        }

    }
    /*
     * 添加客户操作
     * */
    public void addNewCustomer(){

    }
    /*
     *修改客户操作
     * */
    public void modifyCustomer(){

    }
    /*
     * 删除客户操作
     * */
    public void deleteCustomer(){

    }
    /*
     * 客户列表操作
     * */
    public void listAllCustomers(){

    }

    public static void main(String[] args) {
        CustomerView customerview = new CustomerView();
        customerview.enterMainMenu();
    }
}
