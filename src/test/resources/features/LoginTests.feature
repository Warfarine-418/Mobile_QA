Feature: Login

  Scenario: Login without email

    Given User is on Login page
    When User click login button
    Then User should see error message "Please enter a valid email address"

  Scenario Outline: Login with data

    Given User is on Login page
    When User set login <login>
    And User set password <password>
    And User click login button
    Then User is logged in
    Examples:
    |login|password|
    |dog  |12345678|
    |cat  |11111111|
