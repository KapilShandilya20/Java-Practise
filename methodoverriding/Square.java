package com.wiect.methodoverriding;

public class Square extends Shape c{ 

	private int side;
	
	public void draw() {
		System.out.println("Drawing a Square" +side);
	}
	
	public void erase() {
		System.out.println("Erasing a Square" +side);
	}

}