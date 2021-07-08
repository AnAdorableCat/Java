package day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//网络编程的客户端
//职责:
//读取服务器端发来的数据
//给服务器端写出数据
public class Client {
    public static void main(String[] args)
                    throws IOException {
        //1,连接到指定的服务器(ip+port)
        Socket socket = new Socket("127.0.0.1",10000);
        System.out.println("客户端和服务器已连接成功~");
        //2,获取写出流
        OutputStream out = socket.getOutputStream();
        //写出hello--getBytes()用来把String转成byte[]
        out.write("hello".getBytes());
//        out.close();
        out.flush();
        //3,读取数据
        InputStream in = socket.getInputStream();
        for (int i = 0; i < 5; i++) {
            char c = (char) in.read();//不要整数,就要字符'h'
            System.out.println(c);
        }
    }
}
