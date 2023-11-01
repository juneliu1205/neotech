package com.neotech.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class invalidPasswordLogin extends CommonMethods {
	
	@Test
	public void invalidPassword() {

		LoginPageElements login = new LoginPageElements();
		
		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);

		// send password
		sendText(login.password, "wrong1234");
		wait(1);

		// click on login
		click(login.loginButton);
		// Or use jsClick or Action.click
		wait(1);

		// Verify error msg
		String expected = "Invalid Credentials";
		String actual = login.invalidPassword.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "Invalid Credentials is not displayed!");
	}
	
	
	
}