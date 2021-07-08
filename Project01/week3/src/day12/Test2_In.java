package day12;
import java.io.*;
//测试 读取流
//1,FileInputStream 和 BufferedInputStream区别是啥
//2,效率上:BufferedInputStream > FileInputStream
//3,为什么:BufferedInputStream底层维护了一个byte[] buf
//默认容量是8192,不像FileInputStream一个字节一个字节的读取
//BufferedInputStream是一个数组一个数组的读
public class Test2_In {
    public static void main(String[] args) throws IOException {
//        method();//FileInputStream
        method2();//BufferedInputStream
    }
    //BufferedInputStream
    public static void method2()
                          throws IOException {
        //1,创建对象--触发了含参构造InputStream类型的参数
 InputStream in = new BufferedInputStream( new FileInputStream("D:\\iotest\\1.txt") );
        //2,开始读取
        int b = 0;
        while ( ( b = in.read() ) != -1){
            System.out.println(b);
        }
        //3,释放资源
        in.close();
    }
    //FileInputStream
    public static void method() throws IOException {
        //1,创建对象--参数是 文件 所在的路径
        InputStream in = new FileInputStream(
                            "D:\\iotest\\1.txt") ;
        //1,创建对象--参数是 一个File对象
        //File file = new File("D:\\iotest\\1.txt");
        //InputStream in2 = new FileInputStream(file) ;
        //把匿名对象作为参数
        //InputStream in3 = new FileInputStream(
                            //new File("D:\\iotest\\1.txt")) ;
        //2,开始读取
        //read()一个一个的读,没数据时永远返回-1
//        int data = in.read();
//        System.out.println(data);
//        int data2 = in.read();
//        System.out.println(data2);
//        int data3 = in.read();
//        System.out.println(data3);
//        int data4 = in.read();
//        System.out.println(data4);//-1
//        int data5 = in.read();
//        System.out.println(data5);//-1
        //TODO 改造读取的代码
        int b = 0;//定义变量,记录读到的数据
        //read()一个一个的读取,没数据时返回-1
        while( ( b = in.read() ) != -1){
            //打印读到的数据
            System.out.println(b);
        }
        //3,释放资源
        in.close();
    }
}
