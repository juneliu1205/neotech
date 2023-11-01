package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Cucumberhw3Steps extends CommonMethods {

@When("user enters login info {string} and {string}")
public void user_enters_login_info_and(String username, String password) {
	  sendText(login.username, username);
	  sendText(login.password, password);
}
@When("I click on login button")
public void i_click_on_login_button() {
    click(login.loginButton);
}
@Then("Welcome {string} message is displayed")
public void welcome_message_is_displayed(String firstname) {
	
    if (dashboard.accountName.isDisplayed()) {
    	System.out.println("Test Passed");
    }
    else{
    	System.out.println("Test faied");
    }
}
//using Data Table
@When("user enters username and password and clicks on login")
public void user_enters_username_and_password(DataTable datetable) {

	List<Map<String, String>> userList = datetable.asMaps();
	
	for (Map<String, String> user : userList) {
		
		String username = user.get("username");
		String password = user.get("password");
		String fName = user.get("firstname");
		
		sendText(login.username, username);
		sendText(login.password, password);
		click(login.loginButton);
		
		waitForVisibility(dashboard.accountName);
		// Validation
		
		String expectedName = fName;
		String actualName = dashboard.accountName.getText();
		
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);

	    wait(1);
		click(dashboard.dropdownmenu);
		click(dashboard.logout);

}
}
}