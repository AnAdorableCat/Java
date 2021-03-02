package cn.tedu.stu;

import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.stu.pojo.Student;

@RestController //标识身份
public class StudentController {
	@RequestMapping("/stu/add")
	public String add(
			@RequestParam("id") Integer pid, 	//起到映射作用，页面id，值放入pid
			String name, 
			Integer age, 
			String[] hobby		//数组
		) {		//SpringMVC会自动把pid封装到方法的参数中
		
		//一般的情况下，参数名字和html页面表单组件名称相同
		System.out.println("从前台接收到的参数：");
		System.out.println(pid);
		System.out.println(name);
		System.out.println(age);
		System.out.println(Arrays.toString(hobby));
		
		return "success";
	}
	
	//页面参数很多，就可以使用POJO对象（纯粹对象，私有属性+get/set），Student来封装页面数据
	//SpringMVC会自动把所有属性的值放到student对象
	//private String name 反射可以拿到私有属性，页面name
	//如果页面的属性和对象的属性匹配，找到了，反射set放入
	//如果页面的属性没有匹配，找不到，舍弃
	@RequestMapping("/stu/add2")
	public Student add2(Student student) {
		System.out.println(student);		//打印student对象，调用toString()
		
		return student;  //返回json对象，在页面展示
	}
}





