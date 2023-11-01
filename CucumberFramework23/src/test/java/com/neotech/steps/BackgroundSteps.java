package com.neotech.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackgroundSteps {

@Given("Precondition1")
public void precondition1() {
   System.out.println("Running Precondition 1!");
}

@Given("Precondition2")
public void precondition2() {
	 System.out.println("Running Precondition 2!");
}

@When("Test number nr1")
public void test_number_nr1() {
	 System.out.println("Running nr1!");
}

@When("Test number nr2")
public void test_number_nr2() {
	 System.out.println("Running nr2!");
}

@When("Test number nr3")
public void test_number_nr3() {
	 System.out.println("Running nr3!");
}

@Then("Validation nr1")
public void validation_nr1() {
	 System.out.println("Running Validation nr1!");
}

@Then("Validation nr2")
public void validation_nr2() {
	 System.out.println("Running Validation nr2!");
}

@When("Test number nr4")
public void test_number_nr4() {
	 System.out.println("Running Test number4!");
}

@When("Test number nr5")
public void test_number_nr5() {
	 System.out.println("Running Test number4!");
}

@When("Test number nr6")
public void test_number_nr6() {
	 System.out.println("Running Test number6!");
}

@Then("Validation nr3")
public void validation_nr3() {
	 System.out.println("Running Validation nr3!");
}

@Then("Validation nr4")
public void validation_nr4() {
	 System.out.println("Running Validation nr4!");
}
}
