@kirchatykh_feature
Feature: Quiz Title

#  Title of Quiz:
#
#  The field is required
#  Min 1 Characters
#  Max 1000 characters
#  Leading and trailing space characters to be eliminate when Quiz is saved in the List of Quizzes

  Background: KAV Create New Quiz
    Given KAV creates new quiz "qa.10000@yahoo.com" "test2022"

  @kirchatykh_scenario_1
  Scenario: KAV Quiz Title accepts Alpha-numeric data
    And KAV types in "1234%&QWERTYqwerty_" into quiz_title positive

  @kirchatykh_scenario_2
  Scenario: KAV Quiz Title as Required field
    And KAV leaves quiz_title as blank

  @kirchatykh_scenario_3
  Scenario: KAV Quiz Title accepts 1 character
    And KAV types in "q" into quiz_title positive

  @kirchatykh_scenario_4
  Scenario: KAV Quiz Title accepts 1000 characters
    And KAV types in 1000 characters into quiz_title positive

  @kirchatykh_scenario_5
  Scenario: KAV Quiz Title accepts 10 character
    And KAV types in "qaqaqaqaqa" into quiz_title positive

  @kirchatykh_scenario_6
  Scenario: KAV Quiz Title doesn't accept 1001 characters
    And KAV types in 1000 characters into quiz_title negative

  @kirchatykh_scenario_7
  Scenario: KAV Quiz Title Leading and trailing space characters to be eliminated
    And KAV creates quiz_title with leading and trailing spaces as " QWERTY "
