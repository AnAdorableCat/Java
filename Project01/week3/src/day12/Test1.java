package day12;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

//测试 File工具类
public class Test1 {
    public static void main(String[] args)
                        throws IOException {
  //1,创建File对象--把指定位置的文件加载到程序中
 File f = new File("E:\\IntelliJ IDEA\\test\\3.txt");
        //2,调用方法
        System.out.println(f.length());//获取字节量
        System.out.println(f.exists());//判断是否存在
        System.out.println(f.isFile());//判断是文件吗
        System.out.println(f.isDirectory());//判断是文件夹吗
        System.out.println(f.getName());//获取名称
        System.out.println(f.getParent());//获取父路径
        System.out.println(f.getAbsolutePath());//获取完整的路径
        //TODO
        f = new File("DE:\\IntelliJ IDEA\\test\\3.txt");
        System.out.println(f.createNewFile());//创建不存在的文件
        f = new File("E:\\IntelliJ IDEA\\test\\x");
        System.out.println(f.mkdir());//创建不存在的文件夹
        f = new File("E:\\IntelliJ IDEA\\test\\x\\y\\z");
        System.out.println(f.mkdirs());//创建多层不存在的文件夹
        f = new File("E:\\IntelliJ IDEA\\test\\3.txt");
        System.out.println(f.delete());//删除文件或空的文件夹

        //TODO 列出文件夹里 的 所有资源
        f = new File("E:\\IntelliJ IDEA\\test");
        String[] s = f.list();//列出所有资源的名字
        //[1.txt, 2.txt, a, x]
        System.out.println(Arrays.toString(s));
        //列出所有资源,并且把每个资源封装成File对象,存入File[]
        File[] fs = f.listFiles();
        System.out.println(Arrays.toString(fs));
    }
}
