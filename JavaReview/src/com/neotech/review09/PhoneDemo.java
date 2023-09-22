package com.neotech.review09;

public class PhoneDemo {
	
	public static void main(String[] args) {

		Phone p = new Phone("S1234", "Samsung", "pas@123");
		p.displayInfo();

		// Not able to access the password from this class
		// p.pasword = "abcd";

		String serial = p.getSerialNumber("pas@123");
		System.out.println("The serial number is -> " + serial);

		p.setSerialNumber("Aylin");
		p.displayInfo(); // Could NOT change

		p.setSerialNumber("Aylin12");
		p.displayInfo(); // Could change

		System.out.println(p.getSerialNumber("pas@123"));

		System.out.println("----------------");

		String phoneBrand = p.getBrand();
		System.out.println("The brand is -> " + phoneBrand);

		// I cannot change the brand
		// because there is NO setter method
		// p.setBrand("Apple");

	}

}