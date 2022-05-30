Feature: Forms

  Scenario: Check text matching
    Given User is on Forms page
    When User clicks on the input field
    And User send keys to input field "string"
    Then User see "string" in the output field

