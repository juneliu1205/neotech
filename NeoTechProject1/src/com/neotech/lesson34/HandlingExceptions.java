package com.neotech.lesson34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingExceptions {

	public static void main(String[] args) {

		
		
		String path = "";
		
		try {
			FileInputStream fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
		//e.printStackTrace();
			System.out.println("Caught FileNotFoundException!!!!");
		}
		

		int a = 5; 
		int b = 0;
		
		
		try {
			System.out.println(a/b);
		} catch (ArithmeticException e) {
//			e.printStackTrace();
			System.out.println("Caught ArithmeticException!!!");
		}
		
		System.out.println("End of code!");
		
	}

}