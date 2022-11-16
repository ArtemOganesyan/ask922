@thomasDorai_feature[2]
Feature: JJTD Test Set For Textual Question Points

  Background:
    Given JJTD open url and login into Teacher Account
    And JJTD create New Quiz with Textual Question

  @thomasDorai_scenario[1]
  Scenario: JJTD scenario for Textual Question Points
    Then JJTD check Textual question points display
    Then JJTD check if Points can be assigned using Slider button
    Then JJTD verify if Points increase or decrease if Points per question slider is increased or decreased

