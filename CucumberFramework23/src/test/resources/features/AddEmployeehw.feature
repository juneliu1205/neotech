@cucumberhw2
Feature: Add Employee Feature Hw

  
  Scenario: Add Employee with first and last name
    Given user is logged in with valid credentials
    And user navigates to employee list page
    And user click on Add Employee button
    And user enter first name and last name
    And user enter location
    And user click save button
    Then validate employee is added

  Scenario: Add Employee without employee id (delete employee id before saving)
    Given user is logged in with valid credentials
    And user navigates to employee list page
    And user click on Add Employee button
    And user enter first name and last name
    And user enter location
    And user delete employee id
    And user click save button

  Scenario: Add Employee and create login Credentials
    Given user is logged in with valid credentials
    And user navigates to employee list page
    And user click on Add Employee button
    And user enter first name and last name
    And user enter location
    And user delete employee id
    And user click Create Login Details
    And user create username and password
