package com.neotech.lesson03;

public class OperationsOrder {

	public static void main(String[] args) {
	//PEMDAS - Parenthesis, Exp, Mul, Div, Add, Sub
		
	int num1, num2, num3;
	
	num1 = 10 + 10 * 2;
	System.out.println(num1);
		
	num2= (10 + 10) * 2;
	System.out.println(num2);
	
	num3 = 2 * 5 +20/5-3; // 2*5=10 -> 20/5=5 -> 10+4-3=11
	System.out.println(num3);
	
	
	}

}
