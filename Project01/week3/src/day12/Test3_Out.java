package day12;

import java.io.*;

//测试 写出流
//复制一行ctrl d  删除一行 ctrl x
//输出 sou t  调整位置alt shift 上/下
//1,FileOutputStream 和 BufferedOutputStream的区别
//2,效率:BufferedOutputStream > FileOutputStream
//3,为什么:BufferedOutputStream底层维护了一个byte[] buf
//默认容量是8192,优化单个字节写出的效率
//和FileOutputStream不同,只能实现一个字节一个字节的写出,效率低
//4,BufferedOutputStream/BufferedInputStream--高级流/缓冲流
public class Test3_Out {
    public static void main(String[] args)
                            throws IOException {
        method();//FileOutputStream
        method2();//BufferedOutputStream
    }
    //BufferedOutputStream
    public static void method2() throws IOException {
        //1,创建对象
        OutputStream out = new BufferedOutputStream(
                        new FileOutputStream("E:\\IntelliJ IDEA\\test") );
        //2,开始写出
        out.write(99);
        out.write(99);
        out.write(99);
        //3,释放资源
        out.close();
    }
    //FileOutputStream
    public static void method() throws IOException {
        //1,创建对象--参数是 要把数据写出到哪个文件里
        OutputStream out = new FileOutputStream(
                            "E:\\IntelliJ IDEA\\test");
        //2,开始写出
        out.write(100);
        out.write(200);
        //3,释放资源
        out.close();
    }
}
