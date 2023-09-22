package com.neotech.review08_Abstraction;

public class Albanian extends Human {
	
	public Albanian (String name) {
		super(name);
	}

	@Override
	public void talk() {
		System.out.println(name + " says Pershendetje");
	}
	public void albanianDance() {
		System.out.println("Dancing Valle Kosovare!");
	}

}
