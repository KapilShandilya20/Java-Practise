package com.wiect.interfaceDemo;

public class Circle extends Shape {

	private float radius;
	
	public double calArea() {
		return this.area = 3.14*radius*radius;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

}