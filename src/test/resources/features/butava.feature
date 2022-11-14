#feature to git

@svb_git_predefined
Feature: SVB test set for Single Choice Question: "other"

  @svb_git_predefined1
  Scenario: SVB scenario for Single Choice Question: "other" text area option
    Given SVB opens URL for the ask app
    Then SVB types in "Email" field
    Then SVB types in "Password" field
    And SVB clicks on "Sing In" button
    And SVB clicks on "Quizzes" button
    And SVB clicks on "Create New Quiz" button
    Then SVB types in "Title of the Quiz" field
    And SVB clicks on "Add Question" button
    Then SVB sets "Single-Choice Type" element
    Then SVB types in "Question" field
    Then SVB types in "Option 1" field
    Then SVB types in "Option 2" field
    Then SVB sets "Option 1" element
    Then SVB sets "Other" element
    And SVB clicks on "Save" button
    And SVB clicks on "My Quiz" button
    And SVB clicks on "Preview" button


