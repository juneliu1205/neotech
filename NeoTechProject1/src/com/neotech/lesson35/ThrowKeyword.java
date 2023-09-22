package com.neotech.lesson35;


class InsufficientFundsException extends RuntimeException 
{
	public InsufficientFundsException(String msg)
	{
		super(msg);
	}
}


public class ThrowKeyword {

	public static void main(String[] args) throws Exception {
		
		Exception ex = new Exception();
		ArithmeticException ae = new ArithmeticException();
		
		//throw ex;
		//throwException();
		
		try {
		withdraw(2000, 2500);
		}
		catch(InsufficientFundsException ife)
		{
			System.out.println(ife.getMessage());
		}
		
		//other codes go on
		//..
		//..
		System.out.println("End of code!");
	}
	
	
	public static void throwException()
	{
		throw new ArithmeticException();
	}
	
	public static void withdraw(int balance, int amount) throws Exception 
	{
		if (amount > balance)
		{
			throw new InsufficientFundsException("Insufficient Funds!");
		}
		
	}

}