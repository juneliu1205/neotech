package com.neotech.lesson07;

import java.util.Scanner;

public class Homework07 {
	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation:
		// A-Excellent, B-Good, C-Average, D-Bad, any other grade
		// --> Not Acceptable. At the end your program should print
		// which grade was entered by the user with explanation.

		System.out.println("Please enter your grade?");
		Scanner input = new Scanner(System.in);
		String grade= input.next();

		if (grade.equals("A")) {
			System.out.println("Wow! A is Excellent!!");
		} else if (grade.equals("B")) {
			System.out.println("Hey!you got a B! It is Good!");
		} else if (grade.equals("C")) {
			System.out.println("Not bad! You are Average!");
		} else if (grade.equals("D")) {
			System.out.println("You need to stydy! D is Dad!");
		} else {
			System.out.println("Not Acceptable!");
		}
		
		switch (grade) {
		case "A":
			System.out.println("Wow! A is Excellent!!");
			break;
		case "B":
			System.out.println("Hey!you got a B! It is Good!");
			break;
		case "C":
			System.out.println("Not bad! You are Average!");
			break;
		case "D":
			System.out.println("You need to stydy! D is Dad!");
			break;
		default:
			System.out.println("Not Acceptable!");
			break;
		}

	}

}
