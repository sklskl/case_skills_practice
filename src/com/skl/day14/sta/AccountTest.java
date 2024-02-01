package com.skl.day14.sta;

public class AccountTest {
    public static void main(String[] args) {
        Account account1 = new Account();
        Account account2 = new Account("123321",30000);
        Account.setInterestRate(0.1);
        Account.setMinMoney(200);
        System.out.println(account1);
        System.out.println(account2.toString());
    }
}
