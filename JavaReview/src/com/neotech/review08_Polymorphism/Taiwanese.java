package com.neotech.review08_Polymorphism;

public class Taiwanese extends Human {
	
	public Taiwanese (String name) {
		super(name);
	}
	
	@Override
	public void talk() {
		System.out.println("你好！我是台灣人,我說中文");
		}
		
	public void cook() {
			System.out.println("Taiwanese cook delicious food!");
	}
}
