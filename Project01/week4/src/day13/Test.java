package day13;

import java.io.File;

public class Test {
    public static void main(String[] args) {

        method1();

    }
    public static void method1(){
        File f = new File("E:\\IntelliJ IDEA\\test");
        File[] a = f.listFiles();
        long b = 0;
        for(int i = 0; i < a.length ; i++){
            if(a[i].isDirectory()){
                System.out.println(a[i].getName());
            }else if(a[i].isFile()){
                b+=a[i].length();
            }
        }
        System.out.println(b);
    }
}
