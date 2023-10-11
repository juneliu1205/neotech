package com.neotech.lesson02;

import org.testng.annotations.Test;

public class EnableAndDisable {
	
	@Test (priority = 0)
	public void firstTest() {
		System.out.println("First Test");
		
	}


	@Test (priority = 1, enabled= false)
	public void secondTest() {
		System.out.println("Second Test");
	}
	

	@Test (priority = 2)
	public void thirdTest() {
		System.out.println("Third Test");
	}
	
	
	@Test (priority = 3)
	public void fourthTest() {
		System.out.println("Fourth Test");
	}
}
