@smoke
Feature: Check if user can add products in wishlist

  Scenario: click on wishlist button on product HTC One M8 Android L 5.0 Lollipop
    When user click on wishlist button
    Then success message is displayed
    And verify background color

    ##Scenario 2 check the Qty value for wishlist
  Scenario: check the Qty value for wishlist
    When  user click on wishlist button
    And Press on wishlist icon
    Then check the Qty bigger than zero
