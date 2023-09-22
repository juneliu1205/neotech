package com.neotech.lesson32;
import java.util.ArrayList;
import java.util.List;


public class Hw313 {


//	    Create a collection of integers in which you can keep duplicates. 
//	    Write a logic to find sum of all integers

		public static void main(String[] args) {

			List<Integer> numbers = new ArrayList<>();

			numbers.add(61);
			numbers.add(12);
			numbers.add(39);
			numbers.add(27);
			numbers.add(45);

			int sum = 0;

			for (Integer i : numbers) {
				sum += i;
			}

			System.out.println("The sum of all elements is -> " + sum);

		}

	}