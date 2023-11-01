@Login
Feature: Login Functionality

  @smoke
  Scenario: Valid Login
    #Given I navigated to the HRM website
    When I enter a valid username
    And I enter a valid password
    And I click on the login button
    Then I validate that I am logged in

  #And I will quit the browser
  @regression
  Scenario: Invalid Password
    # Given I navigated to the HRM website
    When I enter a valid username
    And I enter a invalid password
    And I click on the login button
    Then I Verify that Invalid Credentials is displayed

  #And I will quit the browser
  @cucumberhw3
  Scenario Outline: Login using Scenario Outline and Example Table
    When user enters login info "<username>" and "<password>"
    And I click on login button
    Then Welcome "<firstname>" message is displayed

    Examples: 
      | username    | password    | firstname |
      | James183    | Login456    | James Liu    |
      | Barbara523  | password456 | Barbara Liu  |
      | Kathleen12  | Katlen456   | Kathleen Liu |
      | Alexander67 | alex8902    | Alexander Liu |

  @cucumberhw3
  Scenario: Login using Datatable
    When user enters username and password and clicks on login
      | username  | password    | firstname     |
      | Woody123  | $password55 | Woody Hank     |
      | Buzz456   | $password55 | Buzz Lightyear |
      | Rex789    | $password55 | Rex Shawn      |
      | Jessie101 | $password55 | Jessie Davis   |
