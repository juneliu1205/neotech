package com.neotech.lesson09;

public class NestedLoop {

	public static void main(String[] args) {
	
	for (int i=0 ; i<5; i++)	
	{
	//begining of outer loop
	//System.out.print(i+" ");
	   for (int j =0; j<5; j++)
	   {  //begining of inner loop
		  // System.out.println("i: "+ i +" j: "+j);	
		   System.out.print(j +" ");
		   
	   }  //end of outer loop
	   
	   System.out.println();
	}//end of outer loop
	
		
		
	}

}
