package com.neotech.review09;

public class Phone {
	private String serialNumber;
	private String brand;
	private String pasword;

	public Phone(String serialNumber, String brand, String pasword) {
		this.serialNumber = serialNumber;
		this.brand = brand;
		this.pasword = pasword;
	}

	public void displayInfo() {
		System.out.println("This is a " + brand + " phone with serial number " + serialNumber);
	}

	// Getters and Setters

	// I will give you the serial number
	// ONLY if you provide the correct password
	public String getSerialNumber(String password) {
		String result = "";

		if (this.pasword.equals(password)) {
			result = serialNumber;
		} else {
			result = "Access Denied!!!";
		}

		return result;
	}

	// You will be able to change the serialNumber
	// ONLY if it is 7 characters long
	public void setSerialNumber(String serialNumber) {
		if (serialNumber.length() == 7) {
			this.serialNumber = serialNumber;
		}
	}
	
	// Brand should be view ONLY
	public String getBrand() {
		return this.brand;
	}
}