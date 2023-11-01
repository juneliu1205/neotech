package com.neotech.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineSteps {
	@When("Login with {string} and {string}")
	public void login_with_and(String string, String string2) {
		System.out.println("Running Precondition 1!");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("validate that {string} is displayed")
	public void validate_that_is_displayed(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("We want to say Bye \"Caglar Akcinar“")
	public void we_want_to_say_bye_caglar_akcinar() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("We want to say Bye \"Mesut Erol“")
	public void we_want_to_say_bye_mesut_erol() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("We want to say Bye \"Yildirim Likos“")
	public void we_want_to_say_bye_yildirim_likos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
