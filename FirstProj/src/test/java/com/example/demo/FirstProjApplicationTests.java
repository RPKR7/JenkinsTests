package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjApplicationTests {

	@Test
	void contextLoads() {
		Laptop lap=new Laptop();
		lap.setBrand("Acer");
		lap.setId("1");
		System.out.print(lap);
	}
	
}
