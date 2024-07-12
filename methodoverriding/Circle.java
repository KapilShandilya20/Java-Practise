package com.wiect.methodoverriding;

public class Circle extends Shape{
	private int radius;
	
	public void draw() {
		System.out.println("Drawing a Circle" +radius);
	}
	
	public void erase() {
		System.out.println("Erasing a Circle" +radius);
	}

}