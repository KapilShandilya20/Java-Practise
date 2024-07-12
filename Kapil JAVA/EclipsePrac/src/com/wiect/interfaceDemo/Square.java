package com.wiect.interfaceDemo;

public class Square extends Shape {
	
	public float side;
	
	public double calArea() {
		return this.area = side*side;
	}

	public Square(float side) {
		super();
		this.side = side;
	}

	public float getSide() {
		return side;
	}

	public void setSide(float side) {
		this.side = side;
	}

}