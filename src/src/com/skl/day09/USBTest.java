package src.com.skl.day09;

/**
 * @program: case_skills_practice
 * @ClassName: USB
 * @author: skl
 * @create: 2024-06-25 16:37
 */
public class USBTest {
    public static void main(String[] args) {
    Computer computer = new Computer();
    Printer printer = new Printer();
    computer.transferData(printer);
    computer.transferData(new Camera());
    //创建借口匿名实现类的对象
    USB usb = new USB() {
        @Override
        public void start() {
            System.out.println("USB设备开始工作");
        }

        @Override
        public void stop() {
            System.out.println("USB设备停止工作");
        }
    };
    computer.transferData(usb);
    computer.transferData(new USB() {
        @Override
        public void start() {
            System.out.println("computer-USB设备开始工作");
        }

        @Override
        public void stop() {
            System.out.println("computer-USB设备停止工作");
        }
    });
    }
}
interface USB{
    public abstract void start();
    void stop();
}
class Computer{
    public void transferData(USB usb){
        System.out.println("设备连接成功");
        usb.start();

        System.out.println("数据传输细节操作");

        usb.stop();
    }
}
class Camera implements USB{
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("相机停止工作");
    }
}
class Printer implements USB{

    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机停止工作");
    }
}