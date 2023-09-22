package com.neotech.review05;

public class StringMethods {

	public static void main(String[] args) {
	String str="Pershendetje";
	
	System.out.println(str.length());
	System.out.println(str.isEmpty());
	
	
	
	System.out.println(str.toLowerCase());
	System.out.println(str.toUpperCase());
	
	System.out.println(str);//The original has NOT changed
	
	boolean equal = str.equals("PERSHENDETJE");
	System.out.println(equal);
	
	System.out.println(str.equalsIgnoreCase("PERSHENDETJE"));
	
	System.out.println("-----------------------------");
	
	System.out.println(str.contains ("SH"));
	System.out.println(str.contains ("SH".toLowerCase()   ) );
	
	System.out.println("-----------------------------");
	
	boolean starts = str.startsWith("Per");
	System.out.println(starts);
	
	System.out.println("Does Pershendetje starts with Pershendetje?");
	System.out.println(str.startsWith("Pershendetje"));
	
	System.out.println("Does Pershendetje end with Pershendetje?");
	System.out.println(str.endsWith("je"));
	
	System.out.println("-----------------------------");
	
	String name= "Emine"+ "-"+ "Firik";
	System.out.println (name);
	
	String name2 = "Emine".concat("-").concat("Firik");// <ethod chaining
	System.out.println (name2);
	
	String name3 = "Emine".toUpperCase().concat("-").concat("Firik");
	System.out.println (name3);
			
	//"Emine".length().concat("Firik"); //Compile Time Error		
	//5.concat("Firik");
	
	"Emine".concat("Firik").length(); //this is ok
	System.out.println("-----------------------------");
	
	
	String str2="      Huseyin   asked   a   question       ";
	System.out.println(str2.trim());
	System.out.println(str2.trim().length());
	System.out.println("-----------------------------");
	
	
	String str3="Caglar Boss";
	char letter=str3.charAt(2);
	System.out.println(letter);
	
	System.out.println(str3.indexOf('a'));
	
	//Find the index of letter 'a' , but start looking of index 2
	int indexOfSecondA = str3.indexOf('a',2);
	System.out.println("indexOfSecondA -> " + indexOfSecondA);
	
	
	
	
	
	
	
	}
	
}
