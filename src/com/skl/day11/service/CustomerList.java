package com.skl.day11.service;

import com.skl.day11.bean.Customer;

public class CustomerList {
    private Customer[] customers;
    private int total = 0;

    /*
    * 用来初始化customers数组的构造器
    * totalCustomer：制定数组长度
    * */
    public CustomerList (int  totalCustomer){
        customers  = new Customer[totalCustomer];

    }
    /*
     * 指定客户添加到数组中
     * addCustomer
     * 成功true，失败false
     * */
    public boolean addCustomer(Customer customer){
        if(total>=customers.length){
            return false;
        }
        customers[total] = customer;
        total++;
        return true;
    }
    /*修改
    * 修改指定位置的信息
    * 成功true 失败false
    * */
    public boolean replaceCustomer(int index, Customer customer){
        if(index<0||index>=total){
            return false;
        }else {
            customers[index] = customer;
            return true;
        }

    }
    /*删除指定未知的用户
    * true 成功
    * */
    public boolean deleteCustomer(int index){
        if (index>=customers.length||index<0){
            return false;
        }
        else {
            for (int i = index;i<total-1;i++){
                customers[i] = customers[i+1];
            }
            customers[total-1] = null;
            total--;
            return true;
        }
    }/*
    *获取客户信息
    */
    public Customer[] getAllCustomers(){
        Customer[] cus= new Customer[total];
        for (int i = 0; i < total; i++) {
            cus[i] =customers[i];
        }
        return cus;
    }
    public Customer getCustomer(int index){
        if (index<0|| index>=total){
            return null;
        }
        return customers[index];

    }
    public int getTotal(){
        return total;
    }

}
