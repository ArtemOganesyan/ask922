@JoanThomas_TestSet1_ASK
Feature: Registration Email

  Background:
    Given I open registration url

  @TestSet_Email
  Scenario: Registration Email

    Then I check for valid email address
    Then I check for invalid email address without top level domain
    Then I check if email field is required
    Then I check if whitespaces are allowed in email
    Then I check if more than maximum characters allowed in Full Email
    Then I check if more than Maximum Characters Allowed In Local Part Of Email Address
    Then I check if more than Maximum Characters Allowed In Domain part Of Email Address