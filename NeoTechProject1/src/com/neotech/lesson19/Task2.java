package com.neotech.lesson19;

public class Task2 {
	/*
	 * Create a method that will take a String as a parameter and returns 
	 * reversed String. Method should be available to all classes within 
	 * your project and accessible by class name. Call this method from 
	 * inside the same class and from a class in another package.
	 */
	
	//input: String (parameter)
	//output: String (return type)
	//public
	//accessible by class name: static
	

	//what do you think about this solution???
	// Strings are immutable
	//Example: Sunday
	//first loop: y
	//second loop: ya
	//third loop: yad
	//so many strings created and not used - not an optimal solution
	public static String reverse(String str)
	{
		String reversed = "";
		
		for (int i = str.length()-1; i >=0; i--)
		{
			reversed += str.charAt(i);
		}
		
		return reversed;
	}
	
	// we can use mutable strings ---> StringBuffer or StringBuilder
	
	public static StringBuffer reverse2(String str)
	{
		StringBuffer sb = new StringBuffer(str);
		
		return sb.reverse();
	}
	
	
	
	public static void main(String[] args) {
		
		String day = "Saturday";
		
		System.out.println(Task2.reverse(day));
		System.out.println(Task2.reverse2(day));
		
		
	}
	
}
