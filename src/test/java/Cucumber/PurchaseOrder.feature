
@tag
Feature: Purchase the order from Ecommerce Website
  I want to use this template for my feature file


Background:
Given I landed on Ecommerce page


  @tag2
  Scenario Outline: Positive test of submitting the order
    Given Logged in with username <name> and password <password>
    When I add the product <productName> from cart
    And Checkout <productName> and submit the order
    Then "THANKYOU FOR THE ORDER." messege is display on confirmation page

    Examples: 
      | name                      | password | productName |
      | trunalpatil@gmail.com     | Trunal123| ZARA COAT 3 |
