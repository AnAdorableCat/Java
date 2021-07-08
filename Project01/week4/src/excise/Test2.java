package excise;

import java.io.*;

public class Test2 {
    public static void main(String[] args)
            throws IOException {
        InputStream in = new BufferedInputStream(new FileInputStream("E:\\Java\\wuhu\\6.txt"));
        OutputStream out = new BufferedOutputStream(new FileOutputStream("E:\\Java\\wuhu\\7.txt"));
        int a = 0;
        while((a = in.read())!=-1){
            out.write(a);
        }
        in.close();
        out.close();
    }
}
