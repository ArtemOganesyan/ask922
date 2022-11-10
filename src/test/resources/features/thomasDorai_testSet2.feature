@JoanThomas_TestSet2_ASK
Feature: Textual Question Points

  Background:
    Given I open url and login into Teacher Account
    And I create New Quiz with Textual Question

  @TestSet_Textual
  Scenario: Textual Question Points
    Then I check Textual question points display
    Then I check if Points can be assigned using Slider button
    Then I verify if Points increase or decrease if Points per question slider is increased or decreased

