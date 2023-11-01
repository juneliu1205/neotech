@background
Feature: Background Example

Background:
    Given Precondition1   
    And Precondition2

@smoke  @sprint5
  Scenario: Example1
    When Test nr1 firstName is "Emre" and lastName is "Cinar"
    And Test number nr2
    And Test number nr3
    Then Validation nr1
    And Validation nr2


  Scenario: Example2
    When Test number nr4
    And Test number nr5
    And Test number nr6
    Then Validation nr3
    And Validation nr4
    
  #-------------------------
	#Hooks are executed for every scenario in every feature file
	#Background is executed only for the feature file it belongs to
	
	#----Order of execution----
	#Hooks ---> @Before
	#Background Steps
	#Scenario: Example1
	#Hooks ---> @After
	#------------------
	#------------------
	#Hooks ----> @Before
	#Background Steps
	#Scenario: Example2
	#Hooks ----> @After