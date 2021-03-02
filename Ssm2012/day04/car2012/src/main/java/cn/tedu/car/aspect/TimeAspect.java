package cn.tedu.car.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component		//让spring进行创建实例
@Aspect				//切面定义，默认没有这个包，需要导包
public class TimeAspect {
	//空方法，写切点表达式	"execution(* *(..))"
	@Pointcut("execution(public * cn.tedu.car.service..*(..))")
	private void aopPointCut() {
		
	}
	
	//方法，配置环绕通知，参数，JoinPoint连接点（拦截对象）
	@Around("aopPointCut()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		Object rtn = joinPoint.proceed();		//调用业务来回调 invoke
		
		long endTime = System.currentTimeMillis();
		
		String name = joinPoint.getTarget().getClass().getName()  	//被拦截类名称
				+ "#"+joinPoint.getSignature().getName();						//被拦截方法
		System.out.println(name+" 执行耗时：" + (endTime-startTime));
		
		return rtn;
	}
}
