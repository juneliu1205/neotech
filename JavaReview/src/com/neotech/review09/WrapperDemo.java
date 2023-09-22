package com.neotech.review09;

public class WrapperDemo {
	public static void main(String[] args) {

		int num1 = 5;

		// Integer integer1 = new Integer(num1); // until java 1.8
		// Integer integer2 = Integer.valueOf(num1); // Java9 and up

		Integer integer1 = new Integer(num1); // Boxing/Wrapping
		int num2 = integer1.intValue(); // UnBoxing/UnWrapping

		// Easy way
		int num3 = 8;
		Integer integer3 = num3; // Auto-Boxing, Auto-Wrapping, Auto-converting
		int num4 = integer3; // Auto-UnBoxing, Auto-UnWrapping, Auto-converting

		// Double Wrapper
		double d1 = 3.5;
		Double d2 = d1; // Auto-Boxing

		// long way
		Double d3 = new Double(4.7); // Boxing
		// short way
		Double d4 = 4.7; // Auto-Boxing

		double d5 = d4; // Auto-UnBoxing

		Boolean b = true; // Auto-Boxing

		Character c = '$'; // Auto-Boxing

		// int -> Integer
		// byte -> Byte
		// short -> Short
		// long -> Long
		// float -> Float
		// double -> Double
		// boolean -> Boolean
		// char -> Character

	}

}