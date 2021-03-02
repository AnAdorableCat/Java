package cn.tedu.car.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

@Component //拦截所有方法，打印执行时间
public class TimeInterceptor implements HandlerInterceptor{
	//现在写法有问题，高并发下，出错
	//private long startTime;	//定义成员变量，两个方法就可以共享这个变量
	private ThreadLocal<Long> startTimeTL = new ThreadLocal<Long>();
	//在类的不同方法中共享，而且避免线程安全！
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {

		long startTime = System.currentTimeMillis();		//记录当前系统时间，毫秒值，long
		startTimeTL.set(startTime);			//绑定自己的线程上，私有
		return true;		//放行
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		long endTime = System.currentTimeMillis();	 	//再次记录当前时间
		long startTime = startTimeTL.get();
		startTimeTL.remove();		//必須寫，內存洩漏
		
		System.out.println(handler.toString()+" 执行耗时：" + (endTime-startTime) +" ms"  );
	}
}
