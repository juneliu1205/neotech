package com.neotech.lesson22;

public class AdditionTest {

	public static void main(String[] args) {
			Addition obj = new Addition();
			
			obj.add(5, 3);
			obj.add(5, 6, 7);
			
			obj.add(4.5, 3.2);
			obj.add(6.2, 7.1, 8.5);
			
			obj.add(5.5, 7);
			
			obj.add("Cihan", 10);
			obj.add(10, "Cihan");
			
		}
	} 