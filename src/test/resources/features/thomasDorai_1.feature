@thomasDorai_feature[1]
Feature: JJTD Test Set For Registration Email

  Background:
    Given JJTD open registration url


  @thomasDorai_f1_scenario[1]
  Scenario: JJTD scenario for valid email address
    Then JJTD check for valid email address

  @thomasDorai_f1_scenario[2]
  Scenario: JJTD scenario for invalid email address without top level domain
    Then JJTD check for invalid email address without top level domain

  @thomasDorai_f1_scenario[3]
  Scenario: JJTD scenario for email field required
    Then JJTD check if email field is required

  @thomasDorai_f1_scenario[4]
  Scenario: JJTD scenario for whitespaces allowed in email
    Then JJTD check if whitespaces are allowed in email

  @thomasDorai_f1_scenario[5]
  Scenario: JJTD scenario for maximum characters allowed in full email
    Then JJTD check if more than maximum characters allowed in full email
  @thomasDorai_f1_scenario[6]
  Scenario: JJTD scenario for maximum characters allowed in local part of email address
    Then JJTD check if more than maximum characters allowed in local part of email address

  @thomasDorai_f1_scenario[7]
  Scenario: JJTD scenario for maximum characters allowed in domain part of email address
    Then JJTD check if more than maximum characters allowed in domain part of email address