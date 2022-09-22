@smoke
Feature:user could hover on Categories and select any sub Category

  Scenario:user hover on one of the first 3 main category and select random sub category
    When user hover on the random main category that contains sub category
    And select one of it's own subCategory and click on it
    Then the pageTitle should be equal to name of Selected subCategory


