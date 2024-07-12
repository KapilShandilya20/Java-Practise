package com.wiect.interfaceDemo;

public class AbstractDemo {

	public static void main(String[] args) {
		
		Shape s; 
		s = new Circle(2);
		s.calArea();
		s.showArea();
		
		s = new Square(6);
		s.calArea();
		s.showArea();

		s = new Rectangle(2,5);
		s.calArea();
		s.showArea();

	}

}