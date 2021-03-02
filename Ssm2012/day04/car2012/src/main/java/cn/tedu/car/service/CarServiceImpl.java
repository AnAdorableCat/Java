package cn.tedu.car.service;

import org.springframework.stereotype.Service;

import cn.tedu.car.pojo.Car;

@Service //标识，spring就会按service类进行初始化
public class CarServiceImpl implements CarService {

	@Override
	public Car get() {
		// Repository、Database，模拟
		Car car = new Car(); // 模型就是临时保存数据，在各层中传递
		car.setId(718);
		car.setName("保时捷");
		car.setType("Cayman T");
		car.setColor("红色");
		car.setPrice(641000.0);
		
		return car;
	}

}
