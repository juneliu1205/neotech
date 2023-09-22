package com.neotech.lesson03;

public class ModulusOperatior {

	public static void main(String[] args) {
	
	int a = 25;
	int b = 4;
	
	int div = a / b; //6--> what is after decimal point is lost
	System.out.println("div ->"+ div);
		
	
	//remainder ->25/4=6   -> 6*4=24   -> 25-24=1
	
	int remainder = a % b;
	System.out.println("remainder ->" + remainder);
	
	//dividing double
	double d1 =25.0;
	double d2 = 4.0;
	
	double res = d1/d2;
	System.out.println(res);
	
	
//Last example
	int num1 =13; //we have 13 cars
	int num2 =5;  // we divide to 5 people		
	
	int rem = num1 % num2;
	System.out.println("rem -> " + rem);
	//13/5=2 --> 2x5=10 -->13-10=3
	//Three cars are not given
	
	}

}
