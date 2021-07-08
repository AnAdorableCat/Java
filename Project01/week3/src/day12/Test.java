package day12;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;


public class Test {
    public static void main(String[] args) throws Exception {
        method1();//字节写出
    }
    private static void method1()
            throws Exception {

        long s = System.currentTimeMillis();
        OutputStream out = new FileOutputStream(new File("E:\\IntelliJ IDEA\\test\\2.txt"));

        for(int i = 48 ; i < 1000000; i++) {
            out.write(i);
        }

        s = System.currentTimeMillis() - s;
        System.out.println(s + "--");//3484
        long ss = System.currentTimeMillis();
        OutputStream out2 = new BufferedOutputStream(new FileOutputStream(new File("E:\\IntelliJ IDEA\\test\\2.txt")));

        for(int i = 48 ; i < 1000000; i++) {
            out2.write(i);
        }

        ss = System.currentTimeMillis() - ss;
        System.out.println(ss + "==");//54

        out.close();
        out2.close();

    }

}
