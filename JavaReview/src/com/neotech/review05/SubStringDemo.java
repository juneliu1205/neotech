package com.neotech.review05;

public class SubStringDemo {

	public static void main(String[] args) {
	String longStr="I am very happy today because today is not Monday";
	
	String anotherStr=longStr.substring(5,7);//7 is not included
	System.out.println(anotherStr);
    
	String anotherStr2= longStr.substring(5);//Begin at index 5, until the end
	System.out.println(anotherStr2);
	
	System.out.println(longStr);//No change here
	
	longStr=longStr.substring(10); //re-assigning
	System.out.println(longStr);
	
	
	//Run-time error
	//longStr.substring(9,5);   error
	//longStr=longStr.substring(5, 100);   error
	//longStr.substring(-3, 5);  error 
	
	}

}
