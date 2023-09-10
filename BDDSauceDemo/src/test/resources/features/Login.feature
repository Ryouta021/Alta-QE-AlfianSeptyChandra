@Login
Feature: Login
  As a user i want to login to Souce demo

  @Normal
  Scenario: Normal login
    Given User already on a login page
    When User input "standard_user" as userName "secret_sauce" as a password
    Then  User already will go to product page

  @invalid
  Scenario Outline: Invalid Login
    Given User already on a login page
    When User input "<username>" as userName "<password>" as a password
    Then User sees error "<errorText>" on login page
  Examples:
    | username      | password     | errorText                                                                 |
    | standard_user |              | Epic sadface: Password is required                                        |
    |               | secret_sauce | Epic sadface: Username is required                                        |
    | ryouta021     | password     | Epic sadface: Username and password do not match any user in this service |

