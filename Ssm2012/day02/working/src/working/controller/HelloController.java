package working.controller;

import working.annotation.RequestMapping;

public class HelloController {
	//浏览器：http://localhost:8090/hello，传入：/hello
	@RequestMapping({"/", "/hello"})		//标识要映射
	public String hello() {
		return "springmvc 底层实现";
	}
}
