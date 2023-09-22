package com.neotech.lesson35;

//Create a method checkUserNamethat will throw a runtime exception. 
//Method should throw an exception when the entered username is less 
//than 5 characters.

class UserNameNotFound extends RuntimeException {
	public UserNameNotFound(String msg) {
		super(msg);
	}
}

public class Homework35 {

	public static void main(String[] args) throws Exception {
		Exception ex = new Exception();
		try {
			
			checkUserName("June123");
			checkUserName("Joyce123");
			checkUserName("Alex");
		} catch (UserNameNotFound unf) {
			System.out.println(unf.getMessage());
		}

		// other codes go on
		// ..
		// ..
		System.out.println("End of code!");
	}

	public static void checkUserName(String name) throws Exception {
		if (name.length() < 5) {
			throw new UserNameNotFound("User Name Cant be less than 5 characters!");
		} else {
			System.out.println("Your user name is "+ name);
		}
	}

}
