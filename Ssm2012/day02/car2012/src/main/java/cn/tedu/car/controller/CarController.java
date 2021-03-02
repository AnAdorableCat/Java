package cn.tedu.car.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.car.pojo.Car;

//保时捷718 Cayman T，红色，641000元起
//@Controller		//SpringMVC底层会创建这个对象实例，返回的java
@RestController		//返回的java对象再次进行转换，json字符串
public class CarController {
	//网页：http://localhost:8080/car/get
	@RequestMapping("/car/get")
	public Car get() {
		//没有Service、Repository、Database，模拟
		Car car = new Car();	//模型就是临时保存数据，在各层中传递
		car.setId(718);
		car.setName("保时捷");
		car.setType("Cayman T");
		car.setColor("红色");
		car.setPrice(641000.0);
		
		return car;
	}
}



