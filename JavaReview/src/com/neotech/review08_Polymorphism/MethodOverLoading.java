package com.neotech.review08_Polymorphism;

public class MethodOverLoading {
    //Method signature = method name + parameters
	//Access modifier is NOT part of Method signature
	//return type is NOT part of Method signature
	
	public void methodOne() {
		
	}
	
	public void methodOne(int a) {
		
	}
	
    public void methodOne(String str) {
		
	}
    
    public void methodOne(int a, int b) {
		
	}
    
    public void methodOne(double a, double b) {
		
   	}
    
    public void methodOne(double a, int b) {
		
   	}

    public static void main (String [] args) {
    	
    	MethodOverLoading mo = new MethodOverLoading();
    	
    	mo.methodOne("Joyce");
    	mo.methodOne(5.5, 6);
    	
    	//Polymorphism
    	//Method Overloading
    	//Compile time Polymorphism/early blinding/static binding
    	
    	
    }
    
    
}
