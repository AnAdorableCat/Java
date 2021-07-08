package day14;
import java.io.File;
import java.util.Scanner;
public class Test1 {public static void main(String[] args) {
    System.out.println("请输入文件夹 路径:");
    String path = new Scanner(System.in).nextLine();
    File file = new File(path);
    del(file);
}
    //删除文件夹
    public static void del(File file) {
        //1,列出文件夹里的 所有资源
        File[] a = file.listFiles();
        //遍历数组,得到每个资源a[i]
        for (int i = 0; i < a.length; i++) {
            //2,判断,资源是文件就直接删除
            if(a[i].isFile()){
                a[i].delete();
            }else if(a[i].isDirectory()){
            //3,判断,资源是文件夹的话....重复执行1 2 3 的步骤
                del(a[i]);
            }
        }
        file.delete();//删除空的文件夹
    }
}