package cn.tedu.stu.pojo;

import java.util.Arrays;
import java.util.Date;		//必须导入是util，否则会转换出错

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private Integer pid;
	private String name;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")  //这个注解声明日期格式yyyy-mm-dd
	private Date eduTime;		//创建完成，给它设置get和set方法
	private Integer age;
	private Integer sex;
	private String[] hobby;
	private Integer edu;
	
	public Date getEduTime() {
		return eduTime;
	}
	public void setEduTime(Date eduTime) {
		this.eduTime = eduTime;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public Integer getEdu() {
		return edu;
	}
	public void setEdu(Integer edu) {
		this.edu = edu;
	}
	@Override
	public String toString() {
		return "Student [pid=" + pid + ", name=" + name + ", eduTime=" + eduTime + ", age=" + age + ", sex=" + sex
				+ ", hobby=" + Arrays.toString(hobby) + ", edu=" + edu + "]";
	}
	
}
