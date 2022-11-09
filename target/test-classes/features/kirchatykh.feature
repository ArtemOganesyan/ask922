Feature: Quiz Title

#  Title of Quiz:
#
#  Allowable characters: Alphanumeric & Sp. characters
#  The field is required
#  Min 1 Characters
#  Max 1000 characters
#  Leading and trailing space characters to be eliminate when Quiz is saved in the List of Quizzes

  Background: Create New Quiz
    Given I create new quiz "qa.10000@yahoo.com" "test2022"

  Scenario: Alpha-numeric data
    And I write "1234%&QWERTYqwerty_" into quiz_title positive

  Scenario: Required field
    And I write blank quizz title

  Scenario: Quiz title accepts 1 character
    And I write "q" into quiz_title positive

  Scenario: Quiz title accepts 1000 characters
    And I generate 1000 "q" into quiz_title positive

  Scenario: Quiz title accepts 10 character
    And I write "qaqaqaqaqa" into quiz_title positive

  Scenario: Quiz title doesn't accept 1001 characters
    And I generate 1001 "q" into quiz_title negative

  Scenario: Leading and trailing space characters to be eliminate
    And I create quiz title with leading and trailing spaces as " QWERTY "

