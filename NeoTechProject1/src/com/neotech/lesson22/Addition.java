package com.neotech.lesson22;

public class Addition {
	//void add(int, int)
		void add(int a, int b)
		{
			System.out.println(a + b);
		}
		 
		//not method overloading
//		void add(int num1, int num2)
//		{
//			System.out.println(num1 + num2);
//		}
		
		//method overloading by changing the number of parameters
		//void add(int, int, int)
		void add(int a, int b, int c)
		{
			System.out.println(a + b + c);
		}
		//method overloading by changing the type of the parameters
		void add(double a, double b)
		{
			System.out.println(a + b);
		}
		
		void add(double a, double b, double c)
		{
			System.out.println(a + b + c);
		}
		
		void add(double d, int i)
		{
			System.out.println(d + i);
		}
		
		//the order is important
		void add(String s, int i)
		{
			System.out.println("Cannot add them!");
		}
		//method overloading by changing the order of the parameters
		void add(int i, String s)
		{
			System.out.println("Still cannot add them!");
		}
		
		
	}