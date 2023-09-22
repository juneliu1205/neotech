package com.neotech.review08_Interfaces;

public class Orange extends Fruit implements Peelable{

	public Orange(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void peel() {
		System.out.println("Peeling the orange.");
		
	}
	
}
