package cn.tedu.pojo;

public class Dept {
	private String depName = "软件部";  //初始化

	public Dept() {
		System.out.println("我被创建了dept");
	}
	
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
