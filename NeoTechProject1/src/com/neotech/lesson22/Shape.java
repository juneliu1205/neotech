package com.neotech.lesson22;

//Homework 5:
//Write program: Shape class has a constructor that takes
//the radius and has a subclass as Circle class. In Circle
//class create a method to calculate the area of circle. Test
//your code
public class Shape {
	
	int radius;
	
	Shape(int radius)
	{
		this.radius = radius;
	}
	
}

class Circle extends Shape
{

	Circle(int radius) {
		super(radius);
	}
	
	void calculateArea()
	{
		System.out.println("The area of the cirlce is " + 3 *radius*radius);
	}
}
 