package com.neotech.lesson19_1;

import com.neotech.lesson19.Task2;

public class Task2Demo {

	public static void main(String[] args) {

		String day = "Saturday";
		
		System.out.println(Task2.reverse(day));
		System.out.println(Task2.reverse2(day));
		
		
		//if the second method was not static:
		
//		Task2 obj = new Task2();
//		obj.reverse2(day);
		
	}

}