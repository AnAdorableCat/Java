package day13;

import java.io.*;

public class TestCopy {
    public static void main(String[] args)
            throws IOException {
    File f = new File("E:\\IntelliJ IDEA\\test\\10.txt");
            f.createNewFile();
        InputStream in = new BufferedInputStream(
                new FileInputStream("E:\\IntelliJ IDEA\\test\\1.txt"));
        OutputStream out = new BufferedOutputStream(
                new FileOutputStream("E:\\IntelliJ IDEA\\test\\10.txt"));
                int b = 0;
        while((b = in.read())!=-1){
            out.write(b);
        }
        in.close();
        out.close();
    }
}
