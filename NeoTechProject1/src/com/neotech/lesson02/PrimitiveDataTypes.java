package com.neotech.lesson02;

public class PrimitiveDataTypes {

	public static void main(String[] args) {
		// Data Type name/indentifier       operator      value;

		byte                 yildirim             =         10;
		
		//compiler will give an error
		byte gorkem = 125;
		
		short omer = 2475;
	    //2 can fit also on the byte data type. But it is ok to use it here too.
		short omer2= 2;
		
		
		int merve= 67950;
		int aldi=20;
	    //if you know you will need number bigger than 2 billion we can use long
		long yildirim1  = 29374789234735L;
		long korab  = 2;
		
		
		//what about storing decimals
		float ali=25.356F; //you need to use F at the end of a float value
		double yavuz=25.356;// you do not need F here

		
		System.out.println(ali);
		System.out.println(yavuz);
		
		
		
		
		char can =  '$'  ;        
		char a =  '6'  ;        
		char b =  'a'  ;      //  this is not a number, its a character
		char c =  '7'  ;      //space can also be char
		System.out.println(can);
		
		// to store boolean values (true/false)
		boolean emre=true;
		
		
		System.out.println(emre);
		
		
		

		
		
		
		
	}
	

}


