Feature: Google search for something

  Scenario: Go to google to search something
    Given user is on google.com
    When user enters something to search
    And press enter
    Then user goes to that relevant subject

  Scenario Outline: Login in to some website
    Given user is on home page
    When User enters <userName> and <password>
    And Press login button
    Then user redirects to user dashboard

    Examples:
      | userName   | password |
      | "Jaikumar" | "124"    |
      | "Jai"      | "123"    |
