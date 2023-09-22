package com.neotech.review01;

public class TypeCasting {

	public static void main(String[] args) {	
		
	//byte < short < int < long < float < double 
		
	int intNumber = 34;
	
	// widening/implicit casting/automatically
	double doubleNumber = intNumber;
	System.out.println("intNumber-> " + intNumber);
	System.out.println("doubleNumber-> " + doubleNumber);
	
	
	// narrowing / explicit casting/manually
	byte byteNumber = (byte)intNumber; //It is risky, you MAY loose info
	System.out.println("byteNumber-> " + byteNumber);
	
	//re-assign
	intNumber = 1290;
	
	// in this case we will loose data
	byte b2 = (byte)intNumber;
	System.out.println("b2-> " + b2);	
	
	byte b3 = 85;
	int i3 = (int)b3;
	System.out.println("i3-> " + i3);	
	
	
	double d1 = 43.7;
	int num = (int)d1;
	System.out.println("num-> " + num);	 //You may loose data
	}

}
