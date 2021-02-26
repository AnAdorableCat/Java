package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.pojo.Hello;

public class TestIoCAnnotation {
	public static void main(String[] args) {
		ApplicationContext ac
		= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//约定大于配置，实例名
		Hello hello = (Hello)ac.getBean("hello");
		hello.hi();
		
		System.out.println( ac.getBean("user") );
		System.out.println( ac.getBean("dept") );
	}
}
