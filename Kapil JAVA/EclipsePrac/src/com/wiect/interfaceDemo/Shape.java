package com.wiect.interfaceDemo;

public abstract class Shape {
	
	public double area;
	
	public void showArea() {
		System.out.println("The area of the shape is: " +area);
	}

	public abstract double calArea();
}