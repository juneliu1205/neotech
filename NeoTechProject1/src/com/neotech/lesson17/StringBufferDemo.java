package com.neotech.lesson17;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		//how did we create a String
		String a = "Hello"; //string literal
		String b = new String("Hello"); //String as a class, we are creating an object
		
		
		//when we want to change the string frequently
		StringBuffer sb = new StringBuffer("Hello"); 
		System.out.println(sb);
		
		//I can change the StringBuffer object, without the need to create a new one
		sb.append(" All"); //string is added to the existing sb object
		System.out.println(sb);
		
		a.concat(" All"); //this is not going to change a
		
		System.out.println(sb.length());
		System.out.println(sb.reverse());
		
		String subStr = sb.substring(2,5);
		System.out.println(subStr);
		
		//an example of StringBuilder
		StringBuffer strBuff = new StringBuffer("Some text");
		strBuff.append (" and some other text!");
		
		StringBuilder strBld = new StringBuilder("Some text");
		strBld.append(" and some other text!");
		
		System.out.println(strBuff);
		System.out.println(strBld);
		
		
		
		

	}

}