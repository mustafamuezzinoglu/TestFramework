@gmail
Feature: delete mails in spam folder

  Scenario: new page1 functionality

    Given user is on the home page
    When user click the spam folder
    And user click the delete all button
    Then user should see spam folder page

