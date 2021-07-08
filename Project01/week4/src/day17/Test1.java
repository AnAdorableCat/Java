package day17;
//测试 反射
public class Test1 {
    public static void main(String[] args)
                    throws ClassNotFoundException {
//1,获取Class对象--提供了丰富的方法来解析.class文件的数据
 //TODO 练习:解析String.class里的所有数据
        //Class提供的静态方法forName(类的全路径)
        Class c = Class.forName("java.lang.String");
        //类名.class
        Class c2 = String.class;
        //Object提供的getClass()
        Class c3 = new String().getClass();

        System.out.println(c);
        System.out.println(c2);
        System.out.println(c3);
        //获取类名
        System.out.println(c.getSimpleName());
        //获取包名
        System.out.println(c.getPackage().getName());
        //获取全名
        System.out.println(c.getName());
    }
}
