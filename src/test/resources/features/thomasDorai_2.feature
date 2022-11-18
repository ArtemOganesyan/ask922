@thomasDorai_feature[2]
Feature: JJTD Test Set For Textual Question Points

  Background:
    Given JJTD open url and login into Teacher Account
    And JJTD create New Quiz with Textual Question

  @thomasDorai_f2_scenario[1]
  Scenario: JJTD scenario for Textual question points display
    Then JJTD check Textual question points display

  @thomasDorai_f2_scenario[2]
  Scenario: JJTD scenario for checking if points can be assigned using Slider button
    Then JJTD check if points can be assigned using Slider button

  @thomasDorai_f2_scenario[3]
  Scenario: JJTD scenario for checking if points increase or decrease when Points per question slider is increased or decreased
    Then JJTD verify if points increase or decrease when Points per question slider is increased or decreased