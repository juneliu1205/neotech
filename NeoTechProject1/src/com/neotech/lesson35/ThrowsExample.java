package com.neotech.lesson35;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsExample {

	public static void main(String[] args) {

		calculator();

		try {
			read("");
		} catch (FileNotFoundException e) {
			System.out.println("File not found!!");
		}
		
		System.out.println("End of code!");
	}
	
	public static void calculator() throws ArithmeticException
	{
		
		
		//with try and catch
		
		 try { 
			 division(9, 3); 
			 division(10, 2); 
			 division(5,0); 
			 division(4,2); }
		 catch(ArithmeticException ae) {
		 System.out.println("ArithmeticException handled!"); }
		 
	}
	
	public static void division(int a, int b) throws ArithmeticException
	{
		//1st way to handle is: try and catch block
		//2nd way to handle is: throws ...Exception
		
				System.out.println(a/b);
	}
	
	
	public static void read(String filePath) throws FileNotFoundException
	{
		FileInputStream fis = new FileInputStream(filePath);
	}
	
	

}