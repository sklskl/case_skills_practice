package com.test13;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * @program: case_skills_practice
 * @ClassName: TestClient
 * @author: skl
 * @create: 2024-03-28 14:48
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("10.1.10.37",8888);
        OutputStream os = s.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        dos.writeUTF("hello");
//        System.out.println("客户端启动成功");
        dos.close();
        os.close();
        s.close();
    }

}
