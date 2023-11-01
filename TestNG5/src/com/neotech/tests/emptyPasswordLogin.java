package com.neotech.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class emptyPasswordLogin extends CommonMethods {

	@Test
	public void emptyPassword() {

		LoginPageElements login = new LoginPageElements();
		
		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);

		// send password
		sendText(login.password, "");
		wait(1);

		// click on login
		click(login.loginButton);
		// Or use jsClick or Action.click
		wait(1);

		// Verify error msg
		String expected = "Password cannot be empty";
		String actual = login.passworderror.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "Password cannot be empty is not displayed");
	}
	
	
	
}