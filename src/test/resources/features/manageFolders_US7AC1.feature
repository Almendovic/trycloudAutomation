
Feature: As a user, I should be able to remove files from the favorites and upload a file directly


  Scenario Outline: Verify login with valid credentials. Verify users can add the folder
    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    Then verify the user should be at the dashboard page
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks the add icon on the top
    And user click "new folder”
    And user write a folder name
    When the user click submit icon
    Then Verify the folder is displayed on the page

    Examples:
      | username | password    |
      | User21   | Userpass123 |
      | User51   | Userpass123 |
      | User81   | Userpass123 |
      | User111  | Userpass123 |


  @wip
  Scenario Outline: Verify login with valid credentials. Verify users can upload a file inside a folder
    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    Then verify the user should be at the dashboard page
    Given user on the dashboard page
    When the user clicks the "Files" module
    And user clicks the add icon on the top
    When the user uploads a file with the upload file option
    Then Verify the file is displayed on the page

    Examples:
      | username | password    |
      | User21   | Userpass123 |
      | User51   | Userpass123 |
      | User81   | Userpass123 |
      | User111  | Userpass123 |