package src.com.skl.day05;

/**
 * @program: case_skills_practice
 * @ClassName: CustomerView
 * @author: skl
 * @create: 2024-06-03 22:26
 */
public class CustomerView {

    CustomerList customerList = new CustomerList(10);

    public CustomerView(CustomerList customerList) {
        this.customerList = customerList;
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView(new CustomerList(10));
        customerView.enterMainMenu();
    }

    //进入主界面的方法
    public void enterMainMenu() {
        boolean isFlag = true;
        while (isFlag) {
            System.out.println("/n--------------拼电商客户管理系统--------------/n");
            System.out.println("            1、添 加 客 户");
            System.out.println("            2、修 改 客 户");
            System.out.println("            3、删 除 客 户");
            System.out.println("            4、客 户 列 表");
            System.out.println("            5、退       出");
            System.out.print("        请选择（1-5）：");
            char key = CMUtilty.readMenuSelection();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出（Y/N）");
                    char yn = CMUtilty.readConfirmSelection();
                    if (yn == 'Y') {
                        isFlag = false;
                    }
                    break;
            }
        }
    }

    public void addNewCustomer() {
        System.out.println("\n---------------------添加客户---------------------");
        if (customerList.getTotal() >= customerList.getTotal()) {
            System.out.println("----------------客户列表已满，无法添加---------------");
            return;
        }
        System.out.print("姓名：");
        String name = CMUtilty.readString(10);
        System.out.print("性别：");
        char gender = CMUtilty.readChar();
        System.out.print("年龄：");
        int age = CMUtilty.readInt();
        System.out.print("电话：");
        String phone = CMUtilty.readString(13);
        System.out.print("邮箱：");
        String email = CMUtilty.readString(20);
        Customer cust = new Customer(name, gender, age, phone, email);
        boolean isAdded = customerList.addCustomer(cust);
        if (isAdded) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("---------------------添加失败---------------------");

        }
    }

    public void modifyCustomer() {
        System.out.println("\n---------------------修改客户---------------------");
        while (true) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            int number = CMUtilty.readInt();
            if (number == -1) {
                return; //如果输入-1，则直接结束方法
            } else if (number <= 0 || number > customerList.getTotal()) {
                System.out.println("无法找到指定客户！");
            } else {
                System.out.print("姓名(" + customerList.getCustomer(number - 1).getName() + ")：");
                String newName = CMUtilty.readString(10, customerList.getCustomer(number - 1).getName());
                System.out.print("性别(" + customerList.getCustomer(number - 1).getGender() + ")：");
                char newGender = CMUtilty.readChar(customerList.getCustomer(number - 1).getGender());
                System.out.print("性别(" + customerList.getCustomer(number - 1).getAge() + ")：");
                int newAge = CMUtilty.readInt(customerList.getCustomer(number - 1).getAge());
                System.out.print("电话(" + customerList.getCustomer(number - 1).getPhone() + ")：");
                String newPhone = CMUtilty.readString(13, customerList.getCustomer(number - 1).getPhone());
                System.out.print("邮箱(" + customerList.getCustomer(number - 1).getEmail() + ")：");
                String newEmail = CMUtilty.readString(20, customerList.getCustomer(number - 1).getEmail());

                Customer cust = new Customer(newName, newGender, newAge, newPhone, newEmail);
                boolean isReplaced = customerList.replaceCustomer(number - 1, cust);
                if (isReplaced) {
                    System.out.println("---------------------修改完成---------------------");
                } else {
                    System.out.println("---------------------无法修改---------------------");
                }
                return;
            }
        }

    }

    public void deleteCustomer() {
        System.out.println("\n---------------------删除客户---------------------");
        while (true) {
            System.out.print("请选择待删除客户编号(-1退出)：");
            int number = CMUtilty.readInt();
            if (number == -1) {
                return; //如果输入-1，则直接结束方法
            } else if (number <= 0 || number > customerList.getTotal()) {
                System.out.println("无法找到指定客户！");
            } else {
                System.out.print("确认是否删除(Y/N)：");
                char isDelete = CMUtilty.readConfirmSelection();
                if (isDelete == 'Y') {
                    boolean isDeleted = customerList.deleteCustomer(number - 1);
                    if (isDeleted) {
                        System.out.println("---------------------删除完成---------------------");
                    } else {
                        System.out.println("---------------------删除失败---------------------");
                    }
                }
                return;
            }
        }

    }

    public void listAllCustomers() {
        System.out.println("----------------------------------客户列表----------------------------------");
        if (customerList.getTotal() == 0) {
            System.out.println("没有客户记录！");
        } else {
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
            Customer[] custs = customerList.getAllCustomers();
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i + 1) + "\t\t" + custs[i].getName() + "\t\t" + custs[i].getGender() + "\t\t"
                        + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t\t" + custs[i].getEmail());
            }
        }
        System.out.println("--------------------------------客户列表完成---------------------------------");
    }

}
