package com.neotech.lesson23;

public class ParentChildTest{
	
	public static void main(String[] args) {
	
	Parent p = new Parent();
			//	p.hello();//cannot access, it's private
				Parent.bye();
				
				Child c = new Child();
				//c.hello();
				Child.bye();
		
	
	   }
	}