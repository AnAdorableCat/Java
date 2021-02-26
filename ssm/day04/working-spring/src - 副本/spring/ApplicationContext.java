package spring;

//接口不实现，定要求
public interface ApplicationContext {
	//beanName是指pojo对象实例名，Object就是返回值
	public Object getBean(String beanName);
}
