package com.neotech.lesson34;

public class InfoAboutExceptions {
	
	public static void main(String[] args) {

				//how do we handle exceptions
					//using try and catch
				
				String str = "Hello";
				
				try
				{
					char c = str.charAt(3);
					System.out.println(c);
					
					
					int a = 10; 
					int b = 0; 
					
					System.out.println(a/b);
				}
				catch(StringIndexOutOfBoundsException e)
				{
					//here i can display info about the error
				//	e.printStackTrace();
				//	System.out.println(e);
				//	System.out.println(e.getMessage());
				System.out.println("Do not try to access the wrong index!!!!!");
				}
				catch (ArithmeticException ae)
				{
					System.out.println(ae);
				}
				catch (Exception ex)//superclass of exceptions
				{
					ex.printStackTrace();
				}
				System.out.println("End of code");
				
			}
		}
