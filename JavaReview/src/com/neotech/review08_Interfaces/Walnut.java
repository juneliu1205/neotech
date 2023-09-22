package com.neotech.review08_Interfaces;

//In Java we don't allow multiple inheritance
//In Java we achieve multiple inheritance through interfaces :)

public class Walnut extends Fruit implements Crackable {

	public Walnut(String name) {
		super(name);
		
	}

	@Override
	public void Crack() {
		System.out.println("Walnut is crackable.");
		
	}

}
