package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //标识这是一个springboot程序
public class RunApp {
	public static void main(String[] args) {
		//第一个参数是类名字
		SpringApplication.run(RunApp.class, args);
	}
}
