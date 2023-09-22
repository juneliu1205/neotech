package com.neotech.lesson26;

public class DoctorTest {

	public static void main(String[] args) {
		
		Doctor doc = new Doctor();
		
		doc.setLicenseID(5634674567L);
		System.out.println(doc.getLicenseID());

		doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
		
	}

}
