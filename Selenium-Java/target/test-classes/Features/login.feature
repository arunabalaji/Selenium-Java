#Author: uma.aruna@gmail.com

@tag
Feature: Login

  @tag1
  Scenario Outline: Login into Browserstack application
    Given Open the Chrome Browser
    And Click on the SignIn link
    When Enter Username and Password
    Then Click on Login button
    Then Verify the webpage has loggedin
    Then Click on the iphone add to cart    
    Then Click on checkout button
    Then Fill the firstname as <name>
    Then Fill the lastname as <lastname>
    Then Fill the address <address> state <state> and Postcode <postcode>
    Then Click on Submit button 
    Then Verify the order confirmation message
    Then Verify the order summary
    
    Examples:
      | name  | lastname  | address | state | postcode |
      | Aruna | Manoharan | 12 post | NSW   | 2118     |
  
  
  
