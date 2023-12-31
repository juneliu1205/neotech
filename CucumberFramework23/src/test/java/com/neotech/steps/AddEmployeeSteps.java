package com.neotech.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.neotech.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmployeeSteps extends CommonMethods {

	@Given("user navigates to AddEmployee page")
	public void user_navigates_to_add_employee_page() {
	    click(dashboard.pim);
	    click(dashboard.employeeListLink);
	}
	//Hard-coded Step
	@When("user enters employee first name and last name")
	public void user_enters_employee_first_name_and_last_name() {
	  sendText(addEmployee.fName, "Lionel");
	  sendText(addEmployee.lName, "Messi");
	}
	//Parameterized Step
	@When("user enters employee first name {string} and last name {string}")
	public void user_enters_employee_first_name_and_last_name(String firstName, String lastName) {
		sendText(addEmployee.fName, firstName);
		  sendText(addEmployee.lName, lastName);
	}
	
	
	@When("user selects a location")
	public void user_selects_a_location() {
	    selectDropdown(addEmployee.location, "New York Sales Office");
	}
	@When("user clicks on save button")
	public void user_clicks_on_save_button() {
	   click(addEmployee.save);
	}
	
	//Hard-coded Validation
	@Then("validate that employee is added successfully")
	public void validate_that_employee_is_added_successfully() {
	    waitForVisibility(personalDetails.personalDetailsForm);
	    
	    String expected = "Lionel Messi";
	    String actual = personalDetails.employeename.getText();
	    
	    Assert.assertEquals("The employee name DOES NOT match!", expected, actual);
	}
	
	// Parameterized Validation
	@Then("validate that employee {string} is added successfully")
	public void validate_that_employee_is_added_successfully(String expectedName) {
		waitForVisibility(personalDetails.personalDetailsForm);

		String actualName = personalDetails.employeename.getText();

		// Please make sure you import the Assert class under org.junit package
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}
	
	@When("user clicks on Create Login Details")
	public void user_clicks_on_create_login_details() {
	    jsClick(addEmployee.switchbutton);
	}

	@When("user provides credentials")
	public void user_provides_credentials() {
		sendText(addEmployee.uName, "MarioIcardi");
		sendText(addEmployee.pw, "Wanda123@");
		sendText(addEmployee.confirmpassWord, "Wanda123@");
	}
	
	@When("user enters employee {string}, {string} and {string}")
	public void user_enters_employee_and(String first, String middle, String last) {
		sendText(addEmployee.fName, first);
		sendText(addEmployee.middleName, middle);
		sendText(addEmployee.lName, last);
	}
	@When("user selects a location {string}")
	public void user_selects_a_location(String location) {
		selectDropdown(addEmployee.location, location);
	}
	@Then("validate that {string} and {string} is added successfully")
	public void validate_that_and_is_added_successfully(String firstName, String lastName) {
		waitForVisibility(personalDetails.personalDetailsForm);
        
		String expectedName = firstName+ " " + lastName;
		String actualName = personalDetails.employeename.getText();

		// Please make sure you import the Assert class under org.junit package
		Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);
	}


	// ----------------@UsingDataTable----------------

		@When("user enters employee details and clicks on save and validates it is added")
		public void user_enters_employee_details(DataTable table) {
			// System.out.println(table);

			// asLists() method returns a List for every row (including the header)
			// System.out.println(table.asLists());

			// asMaps() method returns a List of Maps for every data row
			// (NOT including the header)
			// System.out.println(table.asMaps());

			List<Map<String, String>> employeeList = table.asMaps();

			for (Map<String, String> employee : employeeList) {
				System.out.println(employee);

				String fName = employee.get("FirstName");
				String mName = employee.get("MiddleName");
				String lName = employee.get("LastName");

				sendText(addEmployee.fName, fName);
				sendText(addEmployee.middleName, mName);
				sendText(addEmployee.lName, lName);

				selectDropdown(addEmployee.location, "France Regional HQ");
				wait(1);

				click(addEmployee.save);

				waitForVisibility(personalDetails.personalDetailsForm);

				// Validation
				String expectedName = fName + " " + lName;
				String actualName = personalDetails.employeename.getText();

				Assert.assertEquals("The employee name DOES NOT match!", expectedName, actualName);

				// Before the next iteration
				// We need to go to Add Employee page again
				wait(1);
				click(dashboard.employeeListLink);
			}

		}

	}