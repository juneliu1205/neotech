package com.neotech.lesson27;

public class WrapperClasses {
	
	public static void main(String[] args) {

		int num = 10;

		Integer number1 = new Integer(20); // boxing: putting an int inside an
		// Integer object

		int num2 = number1.intValue(); // un-boxing: getting the value from the object

		Integer number2 = 3500; // auto-boxing:converting from primitive to object
		// automatically

		int num3 = number2; // auto-unboxing: converting from object to primivite
		// automatically

		System.out.println(number1.toString());
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;

		System.out.println("min:" + min);
		System.out.println("max:" + max);

		System.out.println("Other Wrapper Classes");
		Boolean bool1 = true; // auto-boxing
		System.out.println(bool1);

		Byte b1 = 25;
		System.out.println(b1);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);

		Double d1 = 3.45;

		Character c1 = new Character('P'); // boxing
		Character c2 = 'X'; // auto-boxing
	}

}