package com.neotech.review06_1;

import com.neotech.review06.USA;

public class Mexico {

	public static void main(String[] args) {

		USA us = new USA();
		
		System.out.println("Which variables can I access from inside the Mexico class?");
		
		System.out.println("public ---> " + us.bestSchool);
		//private, default, and protected cannot be seen from here
	//	System.out.println("default --> " + us.bestState);
	//	System.out.println("protected --> "  + us.mainState);
	//	System.out.println("private ---> " + us.capitalCity);
		
		
		System.out.println("Which methods can I access from inside the Mexico class?");
		
		us.speakEnglish();
	
		//	us.playNBA();	is protected
	//	us.selectPresident(); is private
		
	}

}

//
//
//String ---> length: the number of characters in the string
//char[] ---> length: the number of elements in the array (elements = characters)
//String[] ---> length: the number of elements in the array (elements = strings)
//
//
//"I am"
//['I', ' ', 'a', 'm']
//["today", "is", "sunday", "!"]
//
//
//
//
//
//
//main method ---> I have an array: int[] array = {34,65,654,76,547};
//								  sumArray(array);
//								  
//sumArray method ----> start executing with input: {34,65,654,76,547}
//
//
//
// review01 			--- 	review06 		review06_1				
//								-USA			- Mexico
//								-Canada