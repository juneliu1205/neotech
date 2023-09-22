package com.neotech.review05;

public class MethodsWithReturn {

	public static void main(String[] args) {
		
    String name="Emily";
    
    int numberofChars=name.length();
   System.out.println("The length of "+ name + " is " + numberofChars); 
	
   System.out.println(name.length());
   
   
   MethodsWithReturn m = new MethodsWithReturn();
   boolean res = m.isOdd(8);
   System.out.println("The number 8 is odd? "+res);
   
   boolean res2 = m.isOddAnotherWay(11);
   System.out.println("The number 11 is odd? "+res2);
   
   boolean res3 = m.isOddEnhanced(21);
   System.out.println("The number 21 is odd? "+res3);
   
	}
	
	//If the one is confusing, it's ok!
	//Divide the number by 2, and of the result is true, return true, if the result is false , return false
	
	
	boolean isOddEnhanced(int num) {
		return num %2==1;
	}
	
   boolean isOddAnotherWay(int num) {
	   if(num%2==1) {
		   return true;
	   }else {
		   return false;
	   }
   }
   boolean isOdd(int num) {
	   
	   boolean result;
	   if (num%2==1) {
		   result=true;
		   }else {
			   result=false;
			  
		   }
	   return result;
	   
	   }
	}
   
   
