package day17;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

//利用反射new/set/get/invoke
public class Test3_Student {
    public static void main(String[] args) throws Exception {
        method();//创建对象
//        method2();//执行方法
//        method3();//操作属性
    }
    //操作属性--getField()-set()/get()
    public static void method3() throws Exception {
        //1,获取Class对象
        Class c = Student.class;
        //2,获取指定的属性--参数是成员变量的名称
        Field f = c.getField("age");
        System.out.println(f.getName());//获取属性名
        System.out.println(f.getType().getName());//获取属性类型
        //3,设置属性的值set(1,2)-1是对象2是要给属性设置的具体值
        Object obj = c.newInstance();
        f.set(obj,20);
        //4,获取属性的值并打印
        System.out.println( f.get(obj) );
    }
    //执行方法--getMethod() -newInstance()
    public static void method2() throws Exception {
        //1,获取Class对象
        Class c = Student.class;
        //2,获取指定的方法--参数是方法名称
        Method m = c.getMethod("show");
        //3,执行方法invoke(1,2)-1是对象2是方法要传入的具体参数
        Object obj = c.newInstance();//利用反射创建对象
        m.invoke(obj);
    }
    //利用反射创建对象--newInstance()
    public static void method() throws Exception {
        //1,获取Class对象
        Class c = Student.class;
        //自己new    Student s = new Student();
        //2,利用反射new
        Object o = c.newInstance();//触发了无参构造
        //Student{name='null', age=0}
        System.out.println(o);
        //TODO 触发 含参构造
        //获取要触发的--参数是指,含参构造中的参数类型的Class对象
        Constructor co = c.getConstructor(String.class,int.class);
        //触发含参构造--创建对象时,要传入的参数
        Object ob = co.newInstance("李四",26);
        System.out.println(ob);
    }
}
