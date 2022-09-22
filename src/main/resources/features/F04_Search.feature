@smoke
Feature: user could search with product name and sku.

  Scenario Outline: user could search using product name
    When user clicks on search field
    And user search with "<product_name>"
    Then count the size of result
    And The url contains "url"
    And search result contains "<product_name>"

    Examples:
      | product_name |
      | book         |
      | laptop       |
      | nike         |

  Scenario Outline: user could search for product using sku
    When user clicks on search field
    And user search with "<sku>"
    And user clicks on result
    Then user could find "<sku>" inside product detail page
    Examples:
      | sku       |
      | SCI_FAITH |
      | APPLE_CAM |
      | SF_PRO_11 |
