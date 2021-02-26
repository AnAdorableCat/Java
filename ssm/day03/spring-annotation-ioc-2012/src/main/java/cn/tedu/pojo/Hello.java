package cn.tedu.pojo;

import org.springframework.stereotype.Component;

//这个注解标识，有了这个标识，spring才会创建实例！
//@Component("hello")		//指定方式
@Component						//约定，类名实例名写法 hello		
public class Hello {
	public void hi() {
		System.out.println("spring ioc annotation");
	}
}
