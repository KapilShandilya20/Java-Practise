package com.wiect.interfaceDemo;

public class Rectangle extends Shape{
	
	private float height;
	private float width;
	

	public double calArea() {
		return this.area = height*width;
	}


	public Rectangle(float height, float width) {
		super();
		this.height = height;
		this.width = width;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}
	
}