package com.neotech.lesson31;

import java.util.ArrayList;

public class Homework3 {
	//Create a collection of integers in which you can keep duplicates. 
    //Write a logic to find sum of all integers
	
	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(15);
		numbers.add(15);
		
		System.out.println(numbers);
		
		int sum=0;
		
		for (Integer num: numbers) {
			sum+=num;
		}
		System.out.println("sum=" + sum);
	}

}
