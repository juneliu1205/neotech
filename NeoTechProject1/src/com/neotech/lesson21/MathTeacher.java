package com.neotech.lesson21;

public class MathTeacher extends Teacher {

	boolean goodWithNumbers;
	
	public void teachesMath() {
		System.out.println(fullName+ " teaches MATH!");
	
}
public static void main (String []args) {
	MathTeacher mt= new MathTeacher();
	mt.fullName= "June";
	mt.major="Math";
	mt.goodWithNumbers=true;
	mt.yearsOfExperience=3;
	
	mt.teaches();
	mt.teachesMath();
	
}	
	
	
	
}