package com.neotech.lesson02;

public class VariableValues {

	public static void main(String[] args) {
		
		boolean	neo1 = true;
	    char neo2 = '$';
		byte neo3= 100;
		short neo4= 22767;
		int neo5= 2000000000;
		long neo6= 1234567891L;
		float neo7= 3.145F;
		double neo8= 100;
		
		System.out.println("Original Values");
		System.out.print("neo1=");
		System.out.println(neo1);
		System.out.println(neo2);
		System.out.println(neo3);
		System.out.println(neo4);
		System.out.println(neo5);
		System.out.println(neo6);
		System.out.println(neo7);
		System.out.println(neo8);
		    
		System.out.println("\n");
		System.out.println("Updated Values");
	
		neo1 = false;
		neo2 = '#';
		neo3= 125;
		neo4= 31767;
		neo5= 1000000000;
		neo6= 4234567891L;
		neo7= 2.125F;
		neo8= 54;
			  
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
