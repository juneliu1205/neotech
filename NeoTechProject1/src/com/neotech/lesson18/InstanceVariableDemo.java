package com.neotech.lesson18;

public class InstanceVariableDemo {

	
	public static void main(String[] args) {
		InstanceVariables obj1 = new InstanceVariables();
		System.out.println(obj1.name);

		InstanceVariables obj2 = new InstanceVariables();
		obj2.name = "Emine";
		System.out.println(obj2.name);

		System.out.println("-------------");
		System.out.println(obj1.name);
	}

}