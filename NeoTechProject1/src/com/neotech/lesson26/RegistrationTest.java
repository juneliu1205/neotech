package com.neotech.lesson26;

public class RegistrationTest {

	public static void main(String[] args) {
		
		Registration reg= new Registration();
		
		reg.setuserName("June456");
		System.out.println(reg.getuserName());
		
		reg.setpassword("login123");
		System.out.println(reg.getpassword());
		
		reg.setemail("june@gmhoo.com");
		System.out.println("----------------------");
		
		reg.setuserName("June5");
		reg.setpassword("678AB");
		reg.setemail("june@gmail.com");
		
	}

}
