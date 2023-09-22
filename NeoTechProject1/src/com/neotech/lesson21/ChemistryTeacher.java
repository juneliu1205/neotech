package com.neotech.lesson21;

public class ChemistryTeacher extends Teacher{

boolean goodWithChemistry;
	
	public void doesExperiment() {
		System.out.println(fullName+ " does chemistry experiments");
		if (goodWithChemistry==true) {
			System.out.println(fullName+ " is good with chemistry experiments");	
		}else {
			System.out.println(fullName+ " is not good with chemistry experiments");	
		}
}
	public static void main (String []args) {
		ChemistryTeacher ct= new ChemistryTeacher();
		ct.fullName="Cinty";
		ct.gender='F';
		ct.major="Chemistry";
		ct.goodWithChemistry=true;
		ct.yearsOfExperience=5;
		
		ct.teaches();
		ct.doesExperiment();
	
	
	
	}
	
	
}