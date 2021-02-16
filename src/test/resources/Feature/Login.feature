Feature: To validate the login functionality

  Background: 
    Given user has to launch chrome and hit FB url

  @smoke
  Scenario Outline: To verify the login functionality
    When user enter "<username>" and "<password>"
    And user click login button
    Then user should be in invalid credentials page

    Examples: 
      | username | password |
      | abi      | a@123    |
      | arun     | ar@123   |

  @sanity
  Scenario: To verify the login functionality
    When user has to enter username and password
      | abi | ab123 |
    And user click login button
    Then user unable to enter the home page

  @smoke
  Scenario: To verify the login functionality
    When user has to enter username and password TdL
      | syed   | sy123  |
      | suresh | sur123 |
    And user click login button
    Then user unable to enter the home page

  @smoke @sanity
  Scenario: To verify the login functionality
    When user has to enter username and password TDM
      | username | password |
      | surya    | sur123   |
      | deva     | deva123  |
    And user click login button
    Then user unable to enter the home page
