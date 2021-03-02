package test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.pojo.Hello;

public class TestIoCXml {
	public static void main(String[] args) {
		//创建spring环境，死语法
		ApplicationContext ac
			= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//获取Hello Bean对象，调用齐方法，底层spring创建对象
		Hello hello = (Hello)ac.getBean("hello");		//<bean>的id属性
		
		//直接调用对象方法
		System.out.println(hello);
		hello.hi();
		
		//?会不会创建对象实例
		System.out.println( ac.getBean("user") );
		System.out.println( ac.getBean("dept") );
	}
}
