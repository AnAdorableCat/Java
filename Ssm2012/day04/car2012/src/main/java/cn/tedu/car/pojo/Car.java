package cn.tedu.car.pojo;

//Model模型，View视图，Controller控制：MVC框架
//保时捷718 Cayman T，红色，641000元起
//POJO 它使用各个属性使用包装类型，和后期其它框架对接，简单java对象
public class Car {
	private Integer id;			//编号,718
	private String name;		//保时捷
	private String type;		//Cayman T
	private String color;		//红色
	private Double price;		//641000元
	
	public Integer getId() {		//获取id方法
		return id;
	}
	public void setId(Integer id) {	//设置id方法
		this.id = id;		//前面id类的属性，后面id参数
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override	//这个就不是pojo中标准内容，它是为了调试方便，看对象中属性值
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", type=" + type + ", color=" + color + ", price=" + price + "]";
	}
	
	//一堆getXxx：获取/setXxx：设置
	
}
