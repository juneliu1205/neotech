package com.neotech.lesson02;

public class DeclareVariables {

	public static void main(String[] args) {
	
	boolean	neo1 = true;
    char neo2 = '$';
	byte neo3= 100;
	short neo4= 22767;
	int neo5= 2000000000;
	long neo6= 1234567891L;
	float neo7= 3.145F;
	double neo8= 100;
	//Define if each variable is within range
	boolean isCharInRange;
	boolean isByteInRange;
	boolean isShortInRange;
	boolean isIntInRange;
	boolean isLongInRange;
	boolean isFloatInRange;
	boolean isDoubleInRange;
	
	//Check if Char is within Range
	if (neo2 < 0 || neo2 > 65535)
	{
	isCharInRange = false;
	}
	else {
		isCharInRange = true;
	}
	//Print out if Char is within range
		System.out.print("Char neo2 within range = ");
		System.out.println(isCharInRange);
		
		
		
		System.out.println(neo1);
		System.out.println(neo2);
		System.out.println(neo3);
		System.out.println(neo4);
		System.out.println(neo5);
		System.out.println(neo6);
		System.out.println(neo7);
		System.out.println(neo8);
		
	}

}
