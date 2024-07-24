package src.com.skl.day04;

/**
 * @program: case_skills_practice
 * @ClassName: Account
 * @author: skl
 * @create: 2024-05-31 15:24
 */
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(double balance) {
        this.balance = balance;
    }

    //存钱
    public void deposit(double amount) {
        if (amount > 0) {
            System.out.println("存入成功" + amount);
        } else if (amount < 0) {
            System.out.println("存入失败");
        }
    }

    //取钱
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance = balance - amount;
        } else if (amount < 0 || balance < amount) {
            System.out.println("取款失败");
        }
    }
}
