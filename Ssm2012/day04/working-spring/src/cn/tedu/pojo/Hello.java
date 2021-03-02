package cn.tedu.pojo;

import spring.annotation.Autowired;

public class Hello {
	@Autowired  //注解，标识作用
	public void hi() {
		System.out.println("hi");
	}
	
	public void welcome() {
		System.out.println("welcome");
	}
}
