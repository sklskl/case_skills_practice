package src.com.skl.day04;

/**
 * @program: case_skills_practice
 * @ClassName: Customer
 * @author: skl
 * @create: 2024-05-31 15:46
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
