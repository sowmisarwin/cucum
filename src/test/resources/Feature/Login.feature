Feature: To validate the login functionality

  Scenario: To verify the login functionality
    Given user has to launch chrome and hit FB url
    When user enter username and password
    And user click login button
    Then user should be in invalid credentials page
