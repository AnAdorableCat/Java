package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//标识这个注解是一个Controller
//Rest 标识返回结果，java对象转换json字符串，在页面展示json字符串内容
@RestController	
public class HelloController {
	//页面请求：http://localhost:8080/，http://localhost:8080/hello
	@RequestMapping( {"/", "/hello"} )
	public String hello() {	//添加方法，返回一个字符串
		return "hello springmvc";
	}
}
