package cn.tedu.pojo;

import spring.annotation.Autowired;

public class User {
	@Autowired
	private Dept dept;	//user当前对象他所在部门
	private String userName = "陈强";
	
	public User() {
		System.out.println("我被创建了user");
	}
	
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
