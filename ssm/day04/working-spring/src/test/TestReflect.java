package test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import cn.tedu.pojo.Dept;
import cn.tedu.pojo.Hello;
import spring.annotation.Autowired;

//反射api汇总
public class TestReflect {
	@Test	//创建对象
	public void createObject() throws Exception {
		//创建hello对象实例？
		String className = "cn.tedu.pojo.Hello";
		Class<?> clazz = Class.forName(className);
		Hello hello1 = (Hello)clazz.newInstance();
		
		System.out.println(hello1);
		hello1.hi();
	}
	
	@Test	//执行方法
	public void executeMethod() throws Exception {
		//利用反射api，获取类的所有方法，得到Method对象数组
		String className = "cn.tedu.pojo.Hello";
		Class<?> clazz = Class.forName(className);
		Object instance = clazz.newInstance();
		
		//获取到当前类的所有的方法
		//Method[] ms = clazz.getMethods();	有很多父类方法干扰
		Method[] ms = clazz.getDeclaredMethods();  //不会展现父类方法
		
		for(Method m : ms) {
			//反射invoke回调方法来执行某个具体方法
			System.out.println( m.getName() );  //打印方法名
			
			m.invoke(instance);		//参数是对象实例
		}
	}
	
	@Test	//注解，特定去执行某件事情
	public void annotation() throws Exception {
		//Autowired，加它的方法运行，不加它的方法不运行
		String className = "cn.tedu.pojo.Hello";
		Class<?> clazz = Class.forName(className);
		Object instance = clazz.newInstance();
		
		Method[] ms = clazz.getDeclaredMethods();  //不会展现父类方法
		
		for(Method m : ms) {
			//获取这个方法上的注解
			//Autowired an = m.getAnnotation(Autowired.class);  //获取指定注解
			Annotation an = m.getAnnotation(Autowired.class);
			if(an != null) {		//根据是否存在来作为判断依据
				m.invoke(instance);
			}
		}		
	}
	
	//给类的属性，动态设置值set
	@Test	//DI依赖注入，
	public void setField() throws Exception {
		Class<?> clazz = Class.forName("cn.tedu.pojo.User");
		Object instance = clazz.newInstance();
		
		//假设从容器中获取Dept对象：getBean("dept")
		Dept dept = new Dept();
		
		//获取类的所有属性
		//clazz.getFields();		//返回公有public属性
		Field[] fs = clazz.getDeclaredFields();	//含有私有private属性
		for(Field f : fs) {
			//私有属性开关打开，安全java源码没有安全性！
			f.setAccessible(true); 		//才能操作私有属性，否则false不能操作
			System.out.println(f.getName());
			
			//获取属性注解，判断是否进行set 注入
			Annotation an = f.getAnnotation(Autowired.class);
			if(an!=null) {
				//反射，set注入 User.setDept(dept);、
				//第一个参数属性所属对象实例，第二个参数要绑定对象
				f.set(instance, dept);		//关联对象就绑定了
			}
		}
		
		System.out.println(instance);  //调用tostring方法
	}
}



