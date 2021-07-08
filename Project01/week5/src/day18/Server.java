package day18;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//网络编程的服务器端
//职责:
//读取客户端发来的数据
//给客户端写出数据
public class Server {
    public static void main(String[] args)
                throws IOException {
        //1,开启服务器--参数是指开着的端口号
        ServerSocket server = new ServerSocket(10000);
        System.out.println("服务器已启动~~");
        //2,接收 客户端发来的请求,并建立Socket通道
        Socket socket = server.accept();
        System.out.println("接收到一个客户端的连接请求...");
        //3,获取读取流
        InputStream in = socket.getInputStream();
        //读取hello
        for (int i = 0; i < 5; i++) {
            int data = in.read();//默认返回的是整数
            char c = (char) data;//不要整数,就要字符'h'
            System.out.println(c);
        }
        //4,给客户端写出数据
        OutputStream out = socket.getOutputStream();
        out.write("world".getBytes());
        out.close();
    }
}
