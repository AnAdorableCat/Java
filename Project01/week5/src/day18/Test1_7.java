package day18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
//测试 jdk7的新特性
//try-with-resources--指IO的异常处理
public class Test1_7 {
    public static void main(String[] args) {
        method();//利用读取流读取数据
    }
    //利用读取流读取数据--IO里释放资源的标准写法
    public static void method() {
        //1,扩大声明范围,因为finally也要用
        InputStream in = null;
        try{
            //2,给in赋值,否则是默认值null
            in = new FileInputStream("");
            int data = in.read();
            System.out.println(data);
        }catch(IOException a){
            System.out.println(123);
        }finally {
            //3,最终的,一定要执行--释放资源
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
