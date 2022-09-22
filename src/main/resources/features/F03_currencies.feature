@smoke
Feature:loggedUser could change currency from dropdown

#TestScenario 1
  Scenario: logged user could switch between currencies from us -> Euro
    When user select us currency from dropdown list
#expected result
    Then validate US Currency

#Change currency to $
    When user select Euro currency from dropdown list
#expected result
    Then validate Euro currency