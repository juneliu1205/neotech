package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class IntroToExceptions {

	public static void main(String[] args) throws FileNotFoundException {


		
		int a = 10; 
		int b = 0; 
		
	//	System.out.println(a/b); //ArithmeticException: / by zero
		
					//0, 1, 2
		int[] array = {2,3,4};
		
	//	System.out.println(array[6]); //ArrayIndexOutOfBoundsException
		
		String filePath = "";
//		FileInputStream fis = new FileInputStream(filePath);//FileNotFoundException
		
		
		NullPointerException npe = new NullPointerException();
		throw(npe);
		
		//if I am doing something else
	//	System.out.println("End of code!");
		
		
	}

}