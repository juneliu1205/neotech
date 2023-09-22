package com.neotech.review06;

public class Canada {

	public static void main(String[] args) {

		USA us = new USA();
		
		System.out.println("Which variables can I access from inside the Canada class?");
		
		System.out.println("public ---> " + us.bestSchool);
		System.out.println("default ---> " + us.bestState);
		System.out.println("protected ---> " + us.mainState);
		//capitalCity is private -- so unable to access outside of class
		//System.out.println("private ---> " + us.capitalCity);
		

		System.out.println("Which methods can I access from inside the Canada class?");
		
		us.speakEnglish();
		us.playNBA();
		
//		selectPresident() is private
	//	us.selectPresident();
		
	}

}