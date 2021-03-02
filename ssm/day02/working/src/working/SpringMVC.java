package working;

import java.lang.reflect.Method;		//反射包下的
import java.util.Arrays;

import working.annotation.RequestMapping;

/*
 * 模拟Spring+SpringMVC底层实现
 * 框架底层利用反射技术：下面反射都是死语法api，这些只能死记
 * 1）获取类
 * 2）创建对象实例
 * 3）获取方法
 * 4）获取方法上的注解，获取注解的value
 * 5）回调（callback）invoke方法，不是直接调用
 */
public class SpringMVC {
	public static void main(String[] args) throws Exception {
		String url = "/hello";		//"http://localhost:8090/hello";
		
		//1、全局限定名=包路径.类名
		//黄色只是提醒，可以不改，加泛型<?>
		Class<?> clazz = Class.forName("working.controller.HelloController");  //获取某个类
		//2、创建对象实例
		Object instance = clazz.newInstance();   //新建实例instance
		System.out.println( instance );
		
		//3、获取方法（看源码，自己实现框架，都是先学实现主干）
		Method m =  clazz.getMethod("hello");	//获取这个类的hello方法
		
		//5、通过方法或者上面注解，通过注解获取value值，等价url=/hello、
		//已知，业务；匹配过程叫做映射Mapping
		RequestMapping an = m.getAnnotation(RequestMapping.class);	//获取方法上的指定注解
		if(an!=null) {
			//最终底层就可以根据url=/hello和这里进行匹配，就执行这个注解所属这个方法（唯一）
			System.out.println( Arrays.toString(an.value()) ); //[/, /hello]
			
			//4、方法回调，执行hello方法，参数是对象实例
			String rtn = (String)m.invoke(instance);  //返回Object，强制转换字符串
			System.out.println(rtn);
		}
		System.out.println("执行完成");
	}
}





