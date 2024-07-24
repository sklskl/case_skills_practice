package src.com.skl.day04;

/**
 * @program: case_skills_practice
 * @ClassName: Bank
 * @author: skl
 * @create: 2024-05-31 15:54
 */
public class Bank {
    private Customer[] customers;//用于保存多个用户
    private int numberOfCustomers;//记录当前有多少个客户

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public void addCustomer(String firstName, String lastName) {
        Customer customer = new Customer(firstName, lastName);
        customers[numberOfCustomers] = customer;
        numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }
    public Customer getCustomer(int index) {
        if(index<0||index>=numberOfCustomers){
            return null;
        }
        return customers[index];
    }
}
