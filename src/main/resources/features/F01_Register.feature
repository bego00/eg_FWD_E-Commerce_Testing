@smoke
Feature: F01_Register | users could register with new accounts

  #Test Scenario 1
  Scenario: guest user could register with valid data successfully
  #Test Steps
    Given user go to register page
    When user select gender type
    And user enter first name 'ahmed' and last name 'hussein'
    And user enter date of birth
    And user enter email 'test@example.com' field
    And user enter password and confirmation password
    And user clicks on register button
#Expected Results
    Then success message is displayed with green background
