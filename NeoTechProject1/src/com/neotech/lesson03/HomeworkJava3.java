package com.neotech.lesson03;

public class HomeworkJava3 {

	public static void main(String[] args) {
		//1. Write a java program to display the area and perimeter
		//of a circle that has a radius of 5. Use pi = 3. 

		//2. Write a java program that converts mile to km and km to miles.
		//Use scale 1 mile = 1.609344.
		//Print the conversion on the console.
		
		//For example: 10 miles is 16.09344 kilometers
	
		int radius, pi;
		
		radius = 5;
		pi = 3;
		
		int perimeter = 2 * pi *radius;
		int area = pi * (radius * radius);
			
		System.out.println("perimeter->"+ perimeter);
		System.out.println("area->"+ area);
	    System.out.println("------------------------------------");
		
	    double d1, d2;
	    d1 = 21;
		d2 = 1.609344;
		
		double double_result = d1 * d2;
		System.out.println(double_result);
		System.out.println("21 miles is " + double_result + " kilometers");
		
		
		System.out.println("------------------------------------");
		double scale = 1.609344;
		double km, mile, km2, mile2;
		
		mile = 2;
		
		km = mile*scale;
		
		System.out.println(mile + " mile is " + km + " kilometers.");
		
		km2 = 60;
		mile2 = km2/scale;
		
		System.out.println(km2 + " kilometers is " + mile2 + " miles." );
		
	}

}
