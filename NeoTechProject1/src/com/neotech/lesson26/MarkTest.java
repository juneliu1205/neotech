package com.neotech.lesson26;

public class MarkTest {

	public static void main(String[] args) {
		StudentA st1 = new StudentA(88,95,94);
		StudentB st2 = new StudentB(95,45,86,84);
		
		System.out.println(st1.getAverage());
		System.out.println(st2.getAverage());
		
		
		
		//runtime polymorphism
		Marks st3 = new StudentA(85,75,95);
		st3.getAverage();
	}

}
