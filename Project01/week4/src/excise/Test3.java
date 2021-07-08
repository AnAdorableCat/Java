package excise;

import java.io.File;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("请输入文件夹 路径");
        String path = new Scanner(System.in).nextLine();
        File file = new File(path);
        long size = sizeOf(file);
        System.out.println(size);
    }

    private static long sizeOf(File file) {
        File[] a = file.listFiles();
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i].isFile()){
                sum+=a[i].length();
            }else if(a[i].isDirectory()){
                sum+=sizeOf(a[i]);
                }
        }
        return sum;
    }
}
