package com.wiect.methodoverriding;

public class Triangle extends Shape { 

	private int base;
	private int height;
	
	public void draw() {
		System.out.println("Drawing a Triangle" +height +base);
	}
	
	public void erase() {
		System.out.println("Erasing a Triangle" +height +base);
	}

}