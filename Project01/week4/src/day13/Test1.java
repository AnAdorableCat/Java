package day13;
import java.io.File;
import java.util.Scanner;
//测试 递归
//方法里调用方法本身.减少代码的编写,但是浪费内存.
public class Test1 {
    public static void main(String[] args) {
        System.out.println("请输入文件夹 路径:");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);
        long size = sizeOf(file);
System.out.println("文件夹路径是: "+path+",总大小是: "+size);
    }
    //计算文件夹大小
    public static long sizeOf(File file) {
//        1,列出文件夹里的 所有资源
        File[] a = file.listFiles();

        long sum = 0;//定义变量,记录总和
        //遍历数组,得到每个资源a[i]
        for (int i = 0; i < a.length; i++) {
//        2,判断,资源是文件就直接求和
            if(a[i].isFile()){
                sum = sum + a[i].length();//求和
            }else if(a[i].isDirectory()){
//        3,判断,资源是文件夹的话....重复执行1 2 3 的步骤
//        继续列表,继续判断是文件就求和是文件夹就继续列表继续判断....
                sum = sum + sizeOf(a[i]);
    //递归:方法里调用方法本身--因为发生了相同的步骤
            }
        }
        return sum;//返回计算结果
    }
}
