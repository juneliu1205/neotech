package com.neotech.lesson26;

public class Registration {

	private String userName;
	private String password;
	private String email;

	public void setuserName(String userName) {
		if (!userName.isEmpty()&& userName.length() > 6 ) {
				this.userName = userName;
		} else {
			System.out.println("Invalid user name!");
		}
	}

	public String getuserName() {
		return userName;
	}
	
	public void setpassword(String password) {
		if (!password.isEmpty()&& password.length() > 6 && !password.contains(userName) ) {
				this.password = password;
		} else {
			System.out.println("Invalid password!");}
	}

	public String getpassword() {
		return password;
	}
	public void setemail(String email) {
		if (email.contains("@yahoo")) {
				this.email = email;
			} else {
				System.out.println("You have to use @yahoo!");
			}	}

	public String getemail() {
		return email;
	}
	
}