package com.neotech.review08_Abstraction;

public class American extends Human {
	
	public American (String name) {
		super(name);
	}
	
	public void talk() {
		System.out.println("I speak english. My name is " + name);
	}

	public void taxReturn() {
		System.out.println("I am doing my taxes!");
	}
}