package com.neotech.steps;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddEmployeehw extends CommonMethods {
	
	
	@Given("user click on Add Employee button")
	public void user_click_on_add_employee_button() {
	    click(dashboard.addEmp);
	}
	
	@Given("user enter first name and last name")
	public void user_enter_first_name_and_last_name() {
		  sendText(addEmployee.fName, "Alivia");
		  sendText(addEmployee.lName, "William");
		  wait(2);
	}
	
	@Given("user enter location")
	public void user_enter_location() {
		selectDropdown(addEmployee.location, "New York Sales Office");
		wait(2);
	}
	
	
	@Given("user click save button")
	public void user_click_save_button() {
		click(addEmployee.save);
	}
	
	@Then("validate employee is added")
	public void validate_employee_is_added() {
    waitForVisibility(personalDetails.personalDetailsForm);
	    
	    String expected = "Alivia William";
	    String actual = personalDetails.employeename.getText();
	    if (actual.equals(expected)) {
	    	System.out.println("Test Passed!");
	    }else {
	    	System.out.println("Test Failed!");
	    }
	}
	
	@Given("user delete employee id")
	public void user_delete_employee_id() {
		addEmployee.eid.clear();
		wait(2);
	}
	
	@Given("user click Create Login Details")
	public void user_click_create_login_details() {
		click(addEmployee.switchbutton);
		wait(2);
	}
	
	@Given("user create username and password")
	public void user_create_username_and_password() {
		  sendText(addEmployee.uName, "Alivia");
		  sendText(addEmployee.pw, "@login123");
		  sendText(addEmployee.confirmpassWord, "@login123");
		  wait(3);
	}





}