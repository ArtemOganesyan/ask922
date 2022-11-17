@adamokova_feature2

Feature: BA test set Student: Settings – Full Name

  Background:

    Given BA login as a student
    Then BA click to "settings"
    Then BA click to "change your name"

  Scenario: BA- scenario for Full Name- Min 2 characters plus 1 space between two words
    And BA type "Pat Kinger" in a "new name" field

  Scenario: BA- scenario for Full name- two space between 2 words- Negative
    And BA type "Pat  Kinger" in a "new name" field

  Scenario: BA- scenario for Full name- White spaces not allowed
    Then BA type "white space(s)" in a "new name" field

  Scenario: BA- scenario for Full name- Full name field required, can’t be empty
    Then BA leaves empty "new name" field

  Scenario: BA- scenario for Full name- Trailing and leading spaces are not allowed
    And BA type "'Pat Kinger' OR 'Pa' OR 'P' with trailing and leading spaces" in a "new name" field

  Scenario: BA- scenario for Full Name- 256 characters including 1 space between two words
    Then BA type "256 characters" in a "new name" field

  Scenario:  BA- scenario for Full name- Alphanumeric & Sp. characters
    Then BA type "Alpha 1@>" in a "new name" field

  Scenario: BA- scenario for Full Name- 257 characters, 1 space- negative
    Then BA type "256 characters and 1 space" in a "new name" field

  Scenario: BA- scenario for Full name- 1 character- negative
    Then BA type "A" in a "new name" field

  Scenario: BA- scenario for Full name- 1 word- negative
    Then BA type "Adam" in a "new name" field