package com.neotech.lesson02;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityDemo {

	@Test (priority = 0, groups = "smoke")
	public void firstTest() {
		System.out.println("First Test");
	}


	@Test (priority = 1)
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
