package com.demo;

import com.demo.test.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
		context.getBean(Car.class);

	}

}
