Feature: Registering a user in Para Bank
  Background:
    Given User is on the Para Bank website
  Scenario: Registering a user for a Para Bank account
    When User clicks the register link
    And User is redirected to the registration page
    And User enters their first name"Jaikumar"
    And User enters their last name"Buddi"
    And User enters their address"Hyderabad"
    And User enters their city"Hyderabad"
    And User enters their state"Telangana"
    And User enters their zipcode"500081"
    And User enters their phone number"1234567890"
    And User enters their ssn"123456789"
    And User enters their username"jaikumar"
    And User enters their password"jaikumar"
    And User confirms their password"jaikumar"
    And User clicks the register button
    Then User is redirected to their profile