package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {
		
	//order of arithmetic operations
	//pemdas	
		
	int num1 = 5+5+5; 	
	System.out.println(num1);
	
	int num2 = 5+5*5; 	
	System.out.println(num2);
		
	int num3 = (5+5)*5; 	
	System.out.println(num3);
	
	
	//we could also print directly	
	System.out.println(5*5+5/5);	

	System.out.println("--------------------------------");
	
	
	int number1 = 15;
	int number2 = 4;
	
	//15/4-->12/4 + 3/4
	int div = number1/number2; //3.75
	System.out.println("div->" + div);
	
	
	int rem = number1 % number2;
	System.out.println("rem->" + rem);
	
	System.out.println("Addition or Concatenation");
	
	int a =10;
	int b =20;
	
	String x ="Java";
	String y ="Tuesday";
	
	System.out.println( x +" "+ y ); //Java Tuesday
	System.out.println( x + y + a); //JavaTuesday 10
	System.out.println( x + a + b); //Java1020
	
	
	System.out.println( x + (a+b)); // Java30
	
	//''---> this is an empty string
	System.out.println( "" + a + b); // 1020
	
	System.out.println( a+ b+ x + y); // 30JavaTuesday
	
	
	System.out.println(x+y+a*b); //JaveTusday200
	System.out.println(x+y+a+b); //JaveTusday1020
	
	//what if
	//compiler error
	//System.out.println(y*b);
	
	String emptyStr= ""; //It is a String, but empty
	String spaceStr= " "; //It is a String, not empty, but only a space
	

	
	}

}
