package excise1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test2 {
    public static void main(String[] args)
                        throws IOException {

        InputStream a = new FileInputStream("E:\\IntelliJ IDEA\\test\\1.txt");
//      int data = a.read();
//      System.out.println(data);
//      int data4 = a.read();
//      System.out.println(data4);
//      int date3 = a.read();
//      System.out.println(date3);
//      int data2 = a.read();
//      System.out.println(data2);//-1
        long start = System.currentTimeMillis();
        int b = 0;
        while ((b=a.read())!=-1){
            System.out.println(b);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        a.close();
    }
}
