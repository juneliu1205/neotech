package com.neotech.lesson08;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
	//++ increment --> add 1 to the variable
	//--decrement --> aubtract 1 from the variable
		
	int x;
	int y = 50;
	x=y++;
	
	
	//Post increment
	// 1. perform x=y
	//2. increment y (y=y+1)
	
	System.out.println(x);	
	System.out.println(y);	


	
    int a;
    int b =15;
    
    //PRE increment
    //1. increment b (b=b+1)
    //2. assign the value of b to a
    a=++b;
    System.out.println(a);	
	System.out.println(b);
	
	
	int c;
	int d = 14;
	
	//POST decrement
    //1. perform c=d
    //2. decrement d (d=d-1)
	
	c=d--;
	System.out.println(c);	
	System.out.println(d);
	
	
	int e;
	int f=20;
	
	//PRE decrement
    //1. decrement f (f=f-1)
    //2. assign the value of f to e
	
	
	e=--f;
	System.out.println(e);	
	System.out.println(f);
	
	
	
	
	
	
}
	
}
