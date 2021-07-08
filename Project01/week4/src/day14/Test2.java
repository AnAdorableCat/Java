package day14;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
public class Test2 {
    public static void main(String[] args) throws IOException {
//        method();
        method2();
    }
    //把List集合里的重复数据去掉
    public static void method2() {
        //准备list,存数据
        List<Integer> list = new ArrayList();
        //获取每个数据,判断重复吗
        for (int i = 0;i < list.size();i++) {
            //获取集合里的数据
            Integer data = list.get(i);
            //判断数据,如果集合里不包含,再add
            if(!list.contains(data)){
                list.add(data);
            }
        }
    }
    //读取1.txt里的数据,并存入List集合中
    public static void method() throws IOException {
        //准备list,存数据
        List<Integer> list = new ArrayList();
        //创建读取流,读取指定文件里的数据
        InputStream in = new FileInputStream("???");
        int b = 0;//定义变量,记录读到的数据
        //开始读取
        while( ( b = in.read() ) != 1){
            //把读到的数据b,存入list
            list.add(b);
        }
        //释放资源
        in.close();
    }
}
