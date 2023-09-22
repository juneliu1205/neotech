package com.neotech.review06;

public class USA {
	
	
	private String capitalCity = "DC";
	protected String mainState = "NY";
	String bestState = "CA";
	public String bestSchool = "Neotech";
	
	
	private void selectPresident()
	{
		System.out.println("Selecting the president only within USA!");
	}
	
	protected void playNBA()
	{
		System.out.println("There are US and Canada teams in the NBA");
	}
	public void speakEnglish()
	{
		System.out.println("English is spoken everywhere!");
	}
	
	
 	public static void main(String[] args) {
 		
 		USA us = new USA();
 		
 		
 		System.out.println("Which variables can I access from inside USA?");
 		
 		System.out.println("public ---> " + us.bestSchool);
 		System.out.println("default ---> " + us.bestState);
 		System.out.println("protected ---> " + us.mainState);
 		System.out.println("private ----> " + us.capitalCity);
 		
 		
 		System.out.println("Which methods can I access from inside USA?");
 		
 		us.speakEnglish(); //accessing public method
 		us.playNBA(); 	//accessing protected method
 		us.selectPresident(); //accessing private method
 		
	}

}