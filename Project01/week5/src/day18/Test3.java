package day18;
//176.46.10.130

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3 {
    public static void main(String[] args)
                   throws IOException {
        ServerSocket server =new ServerSocket(8000);
        System.out.println("服务器已启动~~");
        Socket socket = server.accept();
        System.out.println("接收到一个客户端的连接请求..");

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();

        for(int i = 0 ; i <10000;i++) {
            if((in.read())==-1){
                break;
            }else{
                char c = (char) in.read();
                System.out.print(c);
            }
        }

        out.write("hello".getBytes());
        out.flush();

        socket.close();
        server.close();
    }
}
