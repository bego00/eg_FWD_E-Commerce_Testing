@smoke
Feature: F07_followUs | users could open followUs link
    ##Scenario 1 open facebook in new tab
  Scenario: user opens facebook link
    When user opens facebook link
    And Browser wait for two seconds
    Then validate "https://www.facebook.com/nopCommerce" is opened in new tab

  ##Scenario 2 open twitter in new tab
  Scenario: user opens twitter link
    When user opens twitter link
    And Browser wait for two seconds
    Then validate "https://twitter.com/nopCommerce" is opened in new tab

  ##Scenario 3 open rrs in new tab
  Scenario: user opens rss link
    And Browser wait for two seconds
    When user opens rss link
    Then validate "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab

  ##Scenario 4 open youtube in new tab
  Scenario: user opens youtube link
    When user opens youtube link
    And Browser wait for two seconds
    Then validate "https://www.youtube.com/user/nopCommerce" is opened in new tab
