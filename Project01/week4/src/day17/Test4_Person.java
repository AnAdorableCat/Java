package day17;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

//测试 暴力反射
public class Test4_Person {
    public static void main(String[] args) throws Exception {
//        method();//暴力反射变量
//       method2();//暴力反射方法
        method3();//开启权限
    }
    //开启权限
    public static void method3() throws Exception {
        //1,获取属性score并设置值
        Class c = Person.class;
        //暴力反射,获取属性
        Field f = c.getDeclaredField("score");
        //利用反射创建对象
        Object obj = c.newInstance();
   //TODO 必须给私有属性开启访问权限
   // 否则就是非法访问:IllegalAccessException:
        f.setAccessible(true);//开启权限
        f.set(obj, 99.9);//设置值
        System.out.println(f.get(obj));//获取值
    }
    //暴力反射方法
    public static void method2() {
        //1,获取Class对象
        Class c = Person.class;
        //2,获取所有 方法们
//        Method[] a = c.getMethods();//只能获取public的
        //暴力反射-getDeclaredMethods()-获取所有的
        Method[] a = c.getDeclaredMethods();
        //3,遍历a数组,得到每个方法m
        for (Method m : a) {
            //4,打印方法名
            System.out.println(m.getName());
        }
    }
    //暴力反射变量
    public static void method() {
        //1,获取Class对象
        Class c = Person.class;
        //2,获取所有 变量们
//        Field[] a = c.getFields();//只能获取public
        //暴力反射getDeclaredFields()--获取所有的
        Field[] a = c.getDeclaredFields();
        //3,遍历数组,解析每个变量f
        for (Field f : a) {
            //4,变量名称
            System.out.println(f.getName());
        }
    }
}
