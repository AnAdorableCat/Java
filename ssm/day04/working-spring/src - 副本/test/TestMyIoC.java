package test;

import cn.tedu.pojo.Hello;
import spring.ApplicationContext;
import spring.ClassPathXmlApplicationContext;

//spring底层做了很多事情，无需开发者去开发！
public class TestMyIoC {
	public static void main(String[] args) throws Exception {
		//创建对象，会自动执行构造方法（init，createObject）执行一次
		ApplicationContext ac = new ClassPathXmlApplicationContext();
		
		Hello hello = (Hello)ac.getBean("hello");
		System.out.println(hello);
		hello.hi();
	}
}
