package com.neotech.lesson04;

public class PrimitiveCasting {
	
	public static void main(String[] args) {
	
	//casting or converting
		
	//byte-->short-->int-->long-->float-->double
	
	double d1 = 3.7;  //no casting happened
	System.out.println(d1);
	
	double d2 = 6;   //casting happened
	System.out.println(d2);
		
	//widening, implicit casting, automatic
	int num =5;
	double d3 = num;
	System.out.println(d3);	
	
	//compiler error-Type mismatch:cannot convert from double to int
	//int num2= 6.5;
	
	//narrowing, explicit casting, manually
	int num2 = (int) 6.5; //I tell java, I want to store this here
	System.out.println(num2);	
	
	byte b1 = (byte)4560; //
	System.out.println(b1);	
	
	System.out.println("------------------------------");	
	
	int i2 = 50; //(10101010101010110011010)->(10100101101010)
	byte b2 = (byte)i2;//I might be losing data
	System.out.println(b2);	
	
	//another example:
	long L1 = 17L;
	int number = (int) L1; //am i losing data?
	System.out.println(number);	
	
	long L2 =5474567489240240L;
	int number2 = (int) L2; //am i losing data?
	System.out.println(number2);	
	
	//another widening example
	int number3 = 250;
	float f1 =(float) number3; //I can write it, but it is still widening
	float f2 = number3; //Java handles this automatically
	
	System.out.println(f1);	
	System.out.println(f2);	
	

	   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
