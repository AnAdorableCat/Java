package cn.tedu.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dept {
	private String depName = "软件部";  //初始化

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	@Override
	public String toString() {
		return "Dept [depName=" + depName + "]";
	}
}
