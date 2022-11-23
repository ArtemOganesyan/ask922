@adamokova_feature2

Feature: BA test set Student: Settings – Full Name

  Background:

    Given BA login as a student
    Then BA click to "settings"
    Then BA click to "change your name"

  @adamokova-test1
  Scenario: BA- scenario for Full Name- 2 words plus 1 space between two words
    And BA type "Pat Kinger" in a "new name" field

  @adamokova-test2
  Scenario: BA- scenario for Full name- two space between 2 words- Negative
    And BA type "Pat  Kinger" in a "new name" field

  @adamokova-test3
  Scenario: BA- scenario for Full name- White spaces not allowed- negative
    Then BA type "white space(s)" in a "new name" field

  @adamokova-test4
  Scenario: BA- scenario for Full name- Full name field required, can’t be empty- negative
    Then BA leaves empty "new name" field

  @adamokova-test5
  Scenario: BA- scenario for Full name- Trailing and leading spaces are not allowed- negative
    And BA type "'Pat Kinger' OR 'Pa' OR 'P' with trailing and leading spaces" in a "new name" field

  @adamokova-test6
  Scenario: BA- scenario for Full Name- 256 characters
    Then BA type "256 characters" in a "new name" field

  @adamokova-test7
  Scenario:  BA- scenario for Full name- only latin characters- negative
    Then BA type "Alpha 123" in a "new name" field

  @adamokova-test8
  Scenario: BA- scenario for Full Name- 257 characters, 1 space- negative
    Then BA type "256 characters and 1 space" in a "new name" field

  @adamokova-test9
  Scenario: BA- scenario for Full name- 1 character- negative
    Then BA type "A" in a "new name" field

  @adamokova-test10
  Scenario: BA- scenario for Full name- 1 word 5 characters
    Then BA type "Adamo" in a "new name" field

  @adamokova-test11
  Scenario: BA- scenario for Full name - foreign language characters are not allowed- negative
    Then BA type "ФИО" in a "new name" field
