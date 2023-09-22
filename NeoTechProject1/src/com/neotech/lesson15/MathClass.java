package com.neotech.lesson15;

public class MathClass {

	public static void main(String[] args) {
		Caculator cal = new Caculator();
		System.out.println("Addition");
		cal.add(5, 7);
		cal.add(10, 15);
		cal.add(125, 300);
		
		System.out.println("-----------------------------");
		
		System.out.println("Multiply");
		cal.multiply(5, 7);
		cal.multiply(2, 5);
		
		System.out.println("-----------------------------");
		
		System.out.println("Division");
		cal.divide(8, 3);
		cal.divide(55.2, 13.5);
		cal.divide(3.5, 0);
		cal.divide(0, 3.5);
		
	} 

}
