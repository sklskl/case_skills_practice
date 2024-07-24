package src.com.skl.day04;

/**
 * @program: case_skills_practice
 * @ClassName: BankTest
 * @author: skl
 * @create: 2024-06-03 10:37
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("Jane", "Smith");
        bank.getCustomer(0).setAccount(new Account(500));
        bank.getCustomer(0).getAccount().withdraw(100);
    }
}
