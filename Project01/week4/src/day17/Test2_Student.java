package day17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

//反射Student.class文件里的所有数据
public class Test2_Student {
    public static void main(String[] args) throws ClassNotFoundException {
//        method();//获取Class对象
//        method2();//获取构造方法
//        method3();//获取方法
        method4();//获取成员变量
    }
    //获取成员变量--getFields()
    public static void method4() {
        //1,获取Class对象
        Class c = Student.class;
        //2,获取 所有public的 成员变量
        Field[] fs = c.getFields();
        //3,遍历fs数组,获取每个成员变量f
        for(Field f : fs){
            System.out.println(f.getName());//变量名
            System.out.println(f.getType().getName());//变量类型
        }
    }
    //获取方法--getMethods()
    public static void method3() {
        //1,获取Class对象
        Class c = Student.class;
        //2,获取 所有public的 方法
        Method[] ms = c.getMethods();
        //遍历ms数组,获取每个方法m
        for(Method m : ms){
            System.out.println(m.getName());//方法名称
            //参数的类型
            Class[] cla = m.getParameterTypes();
            System.out.println(Arrays.toString(cla));
        }
    }
    //获取构造方法--getConstructors()
    public static void method2() {
        //1,获取Class对象
        Class c = Student.class;
        //2,获取 所有public的 构造方法
        Constructor[] cs = c.getConstructors();
        //3,foreach遍历数组,获取每个构造方法cc
        for(Constructor cc:cs){
            System.out.println(cc.getName());//名称
            //参数的类型
            Class[] cla = cc.getParameterTypes();
            //打印数组里的数据
            System.out.println(Arrays.toString(cla));
        }
    }
    //获取Class对象
    public static void method() throws ClassNotFoundException {
        //1,类名.class
        Class c = Student.class;
        //2,对象.getClass()
//        Class c1 = new Student().getClass();
        //3,Class.forName();
        Class c2 = Class.forName("cn.tedu.api.Student");
        System.out.println(c);
//        System.out.println(c1);
        System.out.println(c2);
        //4,解析包名类名
        System.out.println(c.getPackage().getName());//包名
        System.out.println(c.getSimpleName());//类名
        System.out.println(c.getName());//包名.类名
    }
}
