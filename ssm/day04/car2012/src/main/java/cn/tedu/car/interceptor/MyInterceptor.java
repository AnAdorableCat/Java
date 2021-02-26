package cn.tedu.car.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component //实现HandlerInterceptor接口
public class MyInterceptor implements HandlerInterceptor{
	//这里不提示它方法，alt+/快捷键生成
	//业务方法执行之前
	@Override //true代表放行，false代表拦截，后面代码都不会执行
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("我是拦截器 preHandle");
		
		return true;		//代表放行
	}
	
	@Override //业务方法执行之后
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		System.out.println("我是拦截器 postHandle");
	}
	
	@Override //返回页面之前
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

		System.out.println("我是拦截器 completion");
	}
}



