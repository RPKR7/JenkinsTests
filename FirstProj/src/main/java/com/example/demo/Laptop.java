package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {

	private String id;
	private String brand;
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void compile() {
		System.out.println("Compile..");
	}
}
