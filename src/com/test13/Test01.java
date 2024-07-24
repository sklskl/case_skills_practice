package com.test13;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @program: case_skills_practice
 * @ClassName: Test01
 * @author: skl
 * @create: 2024-03-27 16:51
 */
public class Test01 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress byName = InetAddress.getByName("127.0.0.1");
        System.out.println(byName);
        //InetAddress localHost = InetAddress.getByName("localhost");
        InetAddress localHost1 = InetAddress.getLocalHost();
//        os.write(localHost1.getHostAddress());
        System.out.println(localHost1);
    }
}
