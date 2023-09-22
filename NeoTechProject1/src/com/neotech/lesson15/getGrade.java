package com.neotech.lesson15;

public class getGrade {
	
	
//	Create a class Student that will have a method getGrade.
//	Your method should accept the score of a student and return a grade:
//		score > 90 - A
//		score > 80 - B
//		score > 70 - C
//		score > 50 - D
//		anything else - F

	
	String grade(int num) {
		if (num >= 90) {
			return "A";
		} else if (num >= 80) {
			return "B";
		} else if (num >= 70) {
			return "C";
		} else if (num >= 50) {
			return "D";
		} else {
			return "F";
		}
	}
	public static void main (String[] args) {
		getGrade student = new getGrade();
		String scores=student.grade(95);
		System.out.println("Scores: "+ scores );
	}
	
}
