@Automate
Feature: Functionality for registration

  Scenario Outline: registration in guru site
    Given : setting up for open a browser
    And : Navigate to the site
    When : Enter the details<Fields> <values>for registration
    And : verify the value
    Then : get the message for successful registration

    Examples: 
      | Fields    | values    |
      | FirstName | Arnold    |
      | LastName  | B         |
      | city      | sydney    |
      | country   | Australia |
