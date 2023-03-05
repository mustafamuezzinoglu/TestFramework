@smoke
Feature: Login functionality

  Scenario Outline: User can login with valid credentials

    Given User is on login page
    When user should be able to write username "<usernames>"
    And User should be able to write password "<passwords>"
    Then User should be able click login button
    Then user should be able see the dashboard

    Examples:

      | usernames         | passwords |
      | student26@library | LkRHUXgR  |
      | student27@library | oMapQ5NZ  |
      | student28@library | Dmr6hS9g  |
      | student29@library | OQki3KSB  |
      | student30@library | 1HLRfjPS  |

