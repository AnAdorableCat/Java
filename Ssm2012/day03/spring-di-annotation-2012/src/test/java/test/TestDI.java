package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.tedu.pojo.Dept;
import cn.tedu.pojo.User;

public class TestDI {
	public static void main(String[] args) {
		//Spring上下文对象，容器
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		User user = (User)ac.getBean("user");
		//Dept dept = (Dept)ac.getBean("dept");
		
		//体现传统关系设定方式
		//set注入，把创建dept对象作为set参数传入，这个就体系关联关系
		//user.setDept(dept); 
		
		System.out.println(user);
		//System.out.println(dept);
		
		
	}
}
