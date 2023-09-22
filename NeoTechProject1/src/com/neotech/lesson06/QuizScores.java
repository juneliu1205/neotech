package com.neotech.lesson06;

import java.util.Scanner;

public class QuizScores {

	public static void main(String[] args) {
		
		//Write a program that will read three inputs of scores (quiz, mid term, and
		//final scores) and determine the grade based on the following rules:
		//if the average score >=90 → grade=A
	    //if the average score >= 70 and <90 → grade=B
		//if the average score>=50 and <70 → grade=C
		//if the average score<50 → grade=F
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your quiz score:");
		double quiz = input.nextInt();
		
		System.out.println("Please enter your midterm score:");
		double midterm = input.nextInt();
		
		System.out.println("Please enter your final score:");
		double finalscores = input.nextInt();
		
		if ((quiz + midterm + finalscores)/3.0 >= 90) 
		{
			System.out.println("Excellent!!! You got a A!");
		} 
		else if((quiz + midterm + finalscores)/3.0 >= 70 && (quiz + midterm + finalscores)/3.0 <90)
		{
			System.out.println("Not Bad! You got a B!");
		} 
		else if ((quiz + midterm + finalscores)/3.0 >= 50 && (quiz + midterm + finalscores)/3.0 <70) 
		{
			System.out.println("Do better! You got a C!");
		} 
		else {
		System.out.println("Booo! you Failed!");
		}

	}
 
}
