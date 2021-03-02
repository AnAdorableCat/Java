package cn.tedu.car.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.car.pojo.Car;
import cn.tedu.car.service.CarService;

//保时捷718 Cayman T，红色，641000元起
//@Controller		//SpringMVC底层会创建这个对象实例，返回的java
@RestController		//返回的java对象再次进行转换，json字符串
public class CarController {
	@Autowired //carService对象直接在beans容器中，实现set注入
	private CarService carService;  //体现对象关联关系
	
	//网页：http://localhost:8080/car/get
	@RequestMapping("/car/get")
	public Car get() {
		System.out.println("car get");
		
		return carService.get();
	}
}



