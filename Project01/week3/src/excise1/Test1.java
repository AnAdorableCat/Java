package excise1;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) throws IOException {
        File a = new File("E:\\IntelliJ IDEA\\test");
//        System.out.println(a.createNewFile());
//        System.out.println(a.delete());
//        a.getAbsolutePath();
//        System.out.println();

        String[] s = a.list();
        System.out.println(Arrays.toString(s));

        File[] s1 = a.listFiles();
        System.out.println(Arrays.toString(s1));


    }
}
