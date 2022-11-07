Feature: As a user, I should be able to log in.



  Scenario Outline: Verify login with valid credentials.

    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    Then verify the user should be at the dashboard page

    Examples:
      | username | password    |
      | User21   | Userpass123 |
      | User51   | Userpass123 |
      | User81   | Userpass123 |
      | User111  | Userpass123 |

