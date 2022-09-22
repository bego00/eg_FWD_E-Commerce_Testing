@smoke
Feature:The two sliders are clickable

  Scenario: first slider is clickable on home page
    When user click on first slider
    Then user redirected to "https://demo.nopcommerce.com/nokia-lumia-1020"


  Scenario: Second slider is clickable on home page
    When user click on second slider
    Then user redirected to "https://demo.nopcommerce.com/iphone-6"