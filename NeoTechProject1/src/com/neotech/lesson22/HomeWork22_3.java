package com.neotech.lesson22;

public class HomeWork22_3 {
	
//Homework 3:
//Create a class with 3 overloaded private methods.
//Then call each overloaded methods with specific 
//arguments and observe the results.
		
	private void add(int a, int b)
		{
		System.out.println(a + b);
		}
		
	private void add(int a, int b, int c)
		{
		System.out.println(a + b + c);
		}
				
	private void add(double a, double b)
		{
		System.out.println(a + b);
		}		
		
	public static void main(String[] args) {
	
		HomeWork22_3 hw3 = new HomeWork22_3();

		hw3.add(5, 2);
		hw3.add(5, 2, 3);
		hw3.add(6.3, 3.9);
	}
		
	} 