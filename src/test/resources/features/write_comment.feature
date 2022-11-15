Feature: As a user, I should be able to write comments to files/folders


  @sam
  Scenario Outline: Verify users to write comments to files/folder
    Given user on the login page
    When user use username '<username>' and passcode '<password>'
    And user click the login button
    When the user clicks the "Files" module
    And user click action-icon from any file on the page
    And user choose the Details option
    And user write a comment"<comment>" inside the input box
    And user click the submit button to post it
    Then Verify the "<comment>" is displayed in the comment section.
    Examples:
      | username | password    | comment       |
      | User21   | Userpass123 | Good job!     |
      | User51   | Userpass123 | Nice work     |
      | User81   | Userpass123 | Do your best  |
      | User111  | Userpass123 | That is great |