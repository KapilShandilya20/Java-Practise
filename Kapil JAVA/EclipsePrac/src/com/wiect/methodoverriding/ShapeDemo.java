package com.wiect.methodoverriding;

public class ShapeDemo{

	public static void main(String[] args) {

		Shape [] shape = new Shape[3];
		Shape [0] shape = new Circle(3);
		Shape [1] shape = new Triangle(4);
		Shape [2] shape = new Square(2,6);
		
		for (Shape s:shape) {
			s.draw();
			s.erase();
		}
	}

}