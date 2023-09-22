package com.neotech.lesson27;

public class RegistrationTest {

	public static void main(String[] args) {
			Registration r = new Registration();
			System.out.println("----Email----");
			
			r.setEmail("caglar@neo.com");
			System.out.println("Email:" + r.getEmail());
			
			r.setEmail("merve@yahoo.com");
			System.out.println("Email:" + r.getEmail());
			
			System.out.println("----Username----");
			r.setUserName("abcd");
			System.out.println("Username:" + r.getUsername());
			
			r.setUserName("abcd123");
			System.out.println("Username:" + r.getUsername());
			
			System.out.println("----Password----");
			r.setPassword("123");
			System.out.println("Password:" + r.getPassword());
			
			r.setPassword("abcd1234");
			System.out.println("Password:" + r.getPassword());
			
			r.setPassword("MyStrongPassword");
			System.out.println("Password:" + r.getPassword());
		}
	
	}