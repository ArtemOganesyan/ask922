@stanfeature
Feature:

  @stanfeature1
  Scenario: Student: "My Assignments" button redirect to "My Assignments"
    Given I open ask url
    Then I type "Email" into text field element
    Then I type "Password" into text field element
    Then I click on "Sign In" button element
    Then I wait for element "STUDENT" to be present
    Then I click on "My Assignments" button element
    Then I wait for element "List of my assignments" to be present
    Then I verify element "My Assignments" contain right text

