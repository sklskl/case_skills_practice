package src.com.skl.day07;

/**
 * @program: case_skills_practice
 * @ClassName: BankTest
 * @author: skl
 * @create: 2024-06-19 15:02
 */
public class BankTest {
    public static void main(String[] args) {

    }
}

class Bank {
    private Bank() {

    }

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }

    public void setInstance(Bank instance) {
        this.instance = instance;
    }
}