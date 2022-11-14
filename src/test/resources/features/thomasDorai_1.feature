@thomasDorai_feature[1]
Feature: JJTD Test Set For Registration Email

  Background:
    Given JJTD open registration url

  @thomasDorai_scenario[1]
  Scenario: JJTD Scenario For Registration Email

    Then JJTD check for valid email address
    Then JJTD check for invalid email address without top level domain
    Then JJTD check if email field is required
    Then JJTD check if whitespaces are allowed in email
    Then JJTD check if more than maximum characters allowed in Full Email
    Then JJTD check if more than Maximum Characters Allowed In Local Part Of Email Address
    Then JJTD check if more than Maximum Characters Allowed In Domain part Of Email Address