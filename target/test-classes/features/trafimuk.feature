@MC_question_text
Feature: Multiple Choice Question - Text

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

  @test_1_mc
  Scenario: Verify that "question" text field allows alphanumeric and special characters
    And I fill out "Question" text field
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    And I save the quiz

  @test_2_mc
  Scenario: Verify "question" text field min length =1 char
    And I fill out "Question" text field with 1 char(s)
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    And I save the quiz

  @test_3_mc
  Scenario: Verify "question" text field length: min 1, max 1000 char (100)
    And I fill out "Question" text field with 100 char(s)
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    And I save the quiz

  @test_4_mc
  Scenario: Verify "question" text field length: 1000 char
    And I fill out "Question" text field with 1000 char(s)
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    And I save the quiz

  @test_5_mc
  Scenario: Verify "question" text field max length =1000 char (1001)
    And I fill out "Question" text field with 1001 char(s)
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    And I save the quiz

  @test_6_mc
  Scenario: Verify that "question" text field is required
    And I click on "Question" text field
#Add assertion Then I see "error" message
    Then I click on "Option 1" text field
    Then I fill out Option 1 text field
    Then I fill out Option 2 text field
    Then I select checkmark box for Option 1
    Then I save the quiz
#      And I see "error" message