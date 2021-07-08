package excise;

import java.io.File;

public class Test1 {
    public static void main(String[] args) {

        //System.out.println(f.isDirectory());
        //System.out.println(f.getName());
       // System.out.println(f.getAbsolutePath());
        //System.out.println(Arrays.toString(new File[]{f}));

       // System.out.println(Arrays.toString(a));
        //System.out.println(f.getPath());
        File f = new File("E:\\Java\\wuhu");
        File[] a = f.listFiles();
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].isDirectory()){
                System.out.println(a[i].getName());
            }else {
                sum+=a[i].length();
            }
        }
        System.out.println(sum);
    }
}
