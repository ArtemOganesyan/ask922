@trafimuk_feature1
Feature: NT test set for Multiple Choice Question - Text

<<<<<<< HEAD
  Background: Test background
    Given I navigate to the login page
    Then I fill out " Email" text field
    Then I fill out "Password" text field
    And I click "Sign In" button
    Then I select "Quizzes" from navigation menu
    Then I click "Create New Quiz" button
    And I fill out "Quiz Title" text field
    Then I click "Add Question" button
    Then I select MC question type
=======
  Background: NT test background
    Given NT navigate to the login page
    Then NT fill out "Email" text field
    Then NT fill out "Password" text field
    And NT click "Sign In" button
    Then NT select "Quizzes" from navigation menu
    Then NT click "Create New Quiz" button
    And NT fill out "Quiz Title" text field
    Then NT click "Add Question" button
    Then NT select MC question type
>>>>>>> main

  @trafimuk_scenario1
  Scenario: NT Verify that "question" text field allows alphanumeric and special characters
    And NT fill out "Question" text field
    Then NT fill out Option 1 text field
    Then NT fill out Option 2 text field
    Then NT select checkmark box for Option 1
    And NT save the quiz

  @trafimuk_scenario2
  Scenario: NT Verify "question" text field min length =1 char
    And NT fill out "Question" text field with 1 char(s)
    Then NT fill out Option 1 text field
    Then NT fill out Option 2 text field
    Then NT select checkmark box for Option 1
    And NT save the quiz

  @trafimuk_scenario3
  Scenario: NT Verify "question" text field length: min 1, max 1000 char (100)
    And NT fill out "Question" text field with 100 char(s)
    Then NT fill out Option 1 text field
    Then NT fill out Option 2 text field
    Then NT select checkmark box for Option 1
    And NT save the quiz

  @trafimuk_scenario4
  Scenario: NT Verify "question" text field length: 1000 char
    And NT fill out "Question" text field with 1000 char(s)
    Then NT fill out Option 1 text field
    Then NT fill out Option 2 text field
    Then NT select checkmark box for Option 1
    And NT save the quiz

  @trafimuk_scenario5
  Scenario: NT Verify "question" text field max length =1000 char (1001)
    And NT fill out "Question" text field with 1001 char(s)
    Then NT fill out Option 1 text field
    Then NT fill out Option 2 text field
    Then NT select checkmark box for Option 1
    And NT save the quiz