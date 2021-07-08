package day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Test4 {
    public static void main(String[] args)
                   throws IOException {
        Socket k = new Socket("127.0.0.1",8000);
        System.out.println("客户端和服务器已连接成功~");

        InputStream in = k.getInputStream();
        OutputStream out = k.getOutputStream();

        out.write("hello".getBytes());
        out.flush();

        for (int i = 0; i < 5 ; i++) {
            char c = (char) in.read();
            System.out.print(c);
        }
        k.close();
    }
}
