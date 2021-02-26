package spring;

//定义一个spring中bead结构，来存储对应关系
public class BeanDefined {
	private String beanName;	//bean名称		hello
	private String className;		//全局限定名		cn.tedu.pojo.Hello
	
	public String getBeanName() {
		return beanName;
	}
	public void setBeanName(String beanName) {
		this.beanName = beanName;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
}
