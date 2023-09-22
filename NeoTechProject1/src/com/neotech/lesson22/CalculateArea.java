package com.neotech.lesson22;

public class CalculateArea {
//	Create a class named CalculateArea in which you should create three methods (with the same name)
//	that will calculate the area (volume) of
//	➔ Rectangle side1 and side 2
//	➔ Square side
//	➔ Box w, h,l
//	Use a separate class to test your code
	
	
	
	void area (int side, int side2)
	{
		System.out.println("The area of Rectangle is "+ side * side2);
	}

	void area (int side)
	{
		System.out.println("The area of Rectangle is "+ side * side );
	}
	
	
	void area(int w, int h, int l)
	{
		System.out.println("The area of the Box is "+ l*h*w);
	}
	
	
	
}
 