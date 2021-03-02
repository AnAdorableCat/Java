package cn.tedu.car.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//实现WebMvcConfigurer接口
//@Configuration		//告诉spring框架，我是一个配置类
public class SysInterceptorConfig implements WebMvcConfigurer{
	@Autowired
	private MyInterceptor myic;
	@Autowired
	private TimeInterceptor timeic;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//注册自己写的拦截器，如果是多个拦截器，形成一个拦截器链
		//拦截器链执行顺序，前面先后出
		//myic.pre > timeic.pre > timeic.post > myic.post
		registry.addInterceptor(myic);
		registry.addInterceptor(timeic);
	}
}
