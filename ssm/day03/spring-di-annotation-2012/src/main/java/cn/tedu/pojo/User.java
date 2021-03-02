package cn.tedu.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	//对象关联关系
	//set注入，把创建dept对象作为set参数传入
	//标识注解，spring去容器获取dept对象，如果有，反射调用set方法
	//有私有属性是否能操作开关true，set方法（反射提供api），有值
	@Autowired
	private Dept dept;	//user当前对象他所在部门
	private String userName = "陈强";
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {			//set注入
		this.dept = dept;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "User [dept=" + dept + ", userName=" + userName + "]";
	}


}
