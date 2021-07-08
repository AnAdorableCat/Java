package day12;

import java.io.*;

public class Test2 {
    public static void main(String[] args)
            throws IOException {

        Method();//FileInputStream
        method2();//BufferedInputSteam

    }

    public static void Method()
            throws IOException{

       // int date = i.read();
      //  System.out.println(date);

        InputStream i = new FileInputStream("E:\\IntelliJ IDEA\\test\\1.txt");

        int b;
        //read()一个一个的读取,没数据时返回-1
        while((b = i.read())!=-1){
            System.out.println(b);
        }

        i.close();
    }

    public static void method2()
            throws IOException {
        //1,创建对象--触发了含参构造InputStream类型的参数
        InputStream f = new BufferedInputStream(
                new FileInputStream("E:\\IntelliJ IDEA\\test\\1.txt"));
        //2,开始读取
        int b;
        while((b = f.read())!=-1){
            System.out.println(b);
        }
        //3,释放资源
        f.close();

    }
}



