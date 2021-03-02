package working.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//仿写springmvc中提供注解，通过特定注解来标识


@Target(ElementType.METHOD)	//标识这个注解可以放在方法之上
@Retention(RetentionPolicy.RUNTIME)  //这个注解在运行时有效
public @interface RequestMapping {
	//特殊方式，写法和普通java语法不同
	String[] value() default {};	//声明一个value方法，字符串数组，默认值空
}
