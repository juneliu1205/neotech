package com.neotech.lesson22;
public class TestShape {
	
	public static void main(String[] args) {

		Shape s = new Shape(5);
	//	s.calcualteArea(); parents do not inherit from children

		Circle c = new Circle(5);
		c.calculateArea();
		
		//can I do this
	//	Circle c2 = new Circle();
	//	c2.calculateArea();
	}

}