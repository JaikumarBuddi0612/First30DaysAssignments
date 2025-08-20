Feature: Bill Payment
  Background:
    Given the user is on the Home page
    When User enters "jaikumar" and "jaikumar" login the user
  Scenario Outline: User performs a bill payment and logs the details
    When the user clicks on the Bill Pay link
    Then the user is redirected to the Payment Process page
    When the user enters payee name "<payeeName>"
    And enters address "<address>"
    And enters city "<city>"
    And enters state "<state>"
    And enters zipcode "<zipcode>"
    And enters phone number "<phoneNumber>"
    And enters account number "<account>"
    And verifies the account number as "<verifyAccount>"
    And enters amount "<amount>"
    And clicks on the Send Payment button
    Then the bill payment is successful
    And the payment logs are printed
    Examples:
      | payeeName     | address         | city        | state     | zipcode | phoneNumber | account   | verifyAccount | amount |
      | ABC Utilities | 123 Main Street | New York    | Telangana | 10001   | 1234567890  | 987654321 | 987654321     | 150.00 |