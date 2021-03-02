package spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

//这个类是spring框架的核心类，它做了很多事情
public class ClassPathXmlApplicationContext implements ApplicationContext{
	//容器，k=beanName，Object=实例
	//private Map<String, Object> beans = new HashMap<String, Object>();
	
	//并发问题，
	private ConcurrentHashMap<String, Object>
		beans  = new ConcurrentHashMap<String, Object>();
	
	//集合，存放bean定义；泛型规定必须是哪个对象，语法检查
	private List<BeanDefined> beanDefinedList = new ArrayList<BeanDefined>();
	
	//构造方法，实现参数初始化；创建new这个类时，它自动调用构造方法
	//只执行一次
	public ClassPathXmlApplicationContext() throws Exception {
		init();
		createObject();
	}
	
	public void init() {		//初始化方法
		//没有包扫描，手工实现，模拟
		BeanDefined hellodb = new BeanDefined();
		hellodb.setBeanName("hello");
		hellodb.setClassName("cn.tedu.pojo.Hello");
		
		beanDefinedList.add(hellodb);		//把上面bean定义添加到list集合中		
	}

	public void createObject() throws Exception {	//创建对象实例，放入容器Map
		//遍历list，foreach遍历，对象遍历方式 v-for
		for(BeanDefined d : beanDefinedList) {
			String beanName = d.getBeanName();		//hello
			String className = d.getClassName();		//cn.tedu.pojo.Hello
			
			//利用反射来创建对象实例
			Class<?> clazz = Class.forName(className);
			Object instance = clazz.newInstance();		//创建Hello对象
			
			//把它放入容器
			beans.put(beanName, instance);
		}
	}
	
	@Override	//Hello hello = (Hello)ac.getBean("hello");
	public Object getBean(String beanName) {
		return beans.get(beanName);
	}
}
