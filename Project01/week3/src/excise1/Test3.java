package excise1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test3 {
    public static void main(String[] args)
            throws IOException {
        OutputStream a = new FileOutputStream("E:\\Java\\wuhu\\7.txt");
        for(int i=0;i<1000;i++){

            a.write("hello".getBytes());

        }
        a.close();
    }
}
