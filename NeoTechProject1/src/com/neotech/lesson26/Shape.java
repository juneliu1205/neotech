package com.neotech.lesson26;
//1. Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter. Create
//2 classes Circle & Square that implements functionality defined in the Shape Interface. Test your
//code.
//
//
//2. We have to calculate the average of marks obtained in three subjects by student A and by student B.
//Create a class 'Marks' with an abstract method 'getAverage' that will be returning the average of
//marks. Provide implementation of the abstract method in classes 'StudentA' and 'StudentB'. The
//constructor of StudentA takes the marks of three subjects as parameters and the constructor of
//StudentB takes marks of four subjects as parameters. Test your code.
public interface Shape {
	

	 void calculateArea(int r); 
	 void calculatePerimeter(int r); 
	 
}

class Circle implements Shape
{
	@Override
	public void calculateArea(int r) {
		System.out.println("The area of the circle is "+ 3*r*r);
	}
	
	@Override
	public void calculatePerimeter(int r) {
		System.out.println("The perimeter of the circle is "+ 2*3*r);
	}
}
	
class Square implements Shape
	{
		@Override
		public void calculateArea(int r) {
			System.out.println("The area of the square is "+ r*r);
		}
		
		@Override
		public void calculatePerimeter(int r) {
			System.out.println("The perimeter of the square is "+ 4*r);
		
	}
}
