package com.neotech.testcases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.neotech.pages.DashboardPageElements;
import com.neotech.pages.LoginPageElements;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods {

	@Test(groups = { "smoke", "regression" })
	public void validLogin() {

		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

		test.info("Entering valid login credentials.");
		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);

		// send password
		sendText(login.password, ConfigsReader.getProperty("password"));
		wait(1);

		test.info("Clicking login button.");
		
		// click on login
		click(login.loginButton);
		// Or use jsClick or Action.click
		wait(1);

		test.info("Verifying that user is logged in.");
		// Verify account name
		String expected = "Jacqueline White";
		String actual = dashboard.accountName.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "The account does NOT match!!!");
	}

	@Test(groups = "regression")
	public void emptyPasswordLogin() {

		LoginPageElements login = new LoginPageElements();
		DashboardPageElements dashboard = new DashboardPageElements();

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

		// Verify account name
		String expected = "Password cannot be empty";
		String actual = login.blankPassword.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "The error MSG does NOT match!!!");
	}

	@Test(groups = "regression")
	public void invalidPasswordLogin() {

		LoginPageElements login = new LoginPageElements();
		//DashboardPageElements dashboard = new DashboardPageElements();

		// send username
		sendText(login.username, ConfigsReader.getProperty("username"));
		wait(1);
		// send password
		sendText(login.password, "Abv567");
		wait(1);

		// click on login
		click(login.loginButton);
		// Or use jsClick or Action.click
		wait(1);

		// Verify account name
		String expected = "Invalid Credentials";
		String actual = login.invalidPassword.getText();

		// Assertion
		Assert.assertEquals(actual, expected, "Invalid Credentials is not displayed!");
	}

	
}