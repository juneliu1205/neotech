package com.neotech.lesson02;

import org.testng.annotations.Test;

public class DependsDemo {
	
	
	@Test 
	public void firstTest() throws Exception {
		System.out.println("First Test");
		//throw new Exception();
	}


	@Test
	public void secondTest() {
		System.out.println("Second Test");
	}
	

	@Test (dependsOnMethods = {"firstTest", "secondTest"})
	public void thirdTest() throws Exception {
		System.out.println("Third Test");
		throw new Exception();
	}
	
	
	@Test (dependsOnMethods = {"thirdTest"})
	public void fourthTest() {
		System.out.println("Fourth Test");
	}
}
//button[@class='btn']