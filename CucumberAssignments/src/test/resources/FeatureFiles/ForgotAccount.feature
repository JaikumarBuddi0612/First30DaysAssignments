Feature: Forgot account details
  Background:
    Given User is on the Para Bank website
  Scenario: Recovering the account details
    Given user is on ParaBank Home page
    When user press forgot login info
    Then user redirects to lookup page
    When User enters their first name "Jaikumar" on forgot page
    When User enters their last name "Buddi" on forgot page
    When User enters their address "Hyderabad" on forgot page
    When User enters their city "Telangana" on forgot page
    When User enters their state "Telangana" on forgot page
    When User enters their zipcode "500081" on forgot page
    When User enters their ssn "123456789" on forgot page
    When User clicks on Find My login info button on forgot page
    Then User details are displayed on forgot page