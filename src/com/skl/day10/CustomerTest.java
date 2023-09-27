package com.skl.day10;

public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("jan","Smith");
        Account account = new Account(10001,2000,0.0123);
        customer.setAccount(account);
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(200);
        System.out.println("Customer["+customer.getLastName()+","+customer.getFirstName()+"] has a count ,id is "+
                customer.getAccount().getId()+"， annualInterestRate is "+customer.getAccount().getAnnualInterestRate()*100+
                "%,balance is "+customer.getAccount().getBalance());

    }
}
