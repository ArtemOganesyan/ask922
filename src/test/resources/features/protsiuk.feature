@predefined
Feature: VP Test set for Teacher: Setting password

  @protsiuk_scenario_1
  Scenario: VP Change Password Happy Path
  Given VP login as "teacher" 'teacher' or 'student' or 'newPasswordTeacher'
  Given VP set "new" password 'old or 'new'
  Given VP Log Out

  @protsiuk_scenario_2
  Scenario: VP Return Password Happy Path
  Given VP login as "newPasswordTeacher" 'teacher' or 'student' or 'newPasswordTeacher'
  Given VP set "old" password 'old or 'new'
  Given VP Log Out

  @protsiuk_scenario_3
  Scenario: VP try to set new password 7 char with leading space
    Given VP try to set "new password 7 char with leading space"

  @protsiuk_scenario_4
  Scenario: VP try to set new password 7 char with trailing space
    Given VP try to set "new password 7 char with trailing space"

  @protsiuk_scenario_5
  Scenario: VP try to set new password with two words with space between words
    Given VP try to set "new password with two words with space between words"

  @protsiuk_scenario_6
  Scenario: VP try to set leave field New Password empty
    Given VP try to set "leave field New Password empty"

  @protsiuk_scenario_7
  Scenario: VP try to set password with less than 5 char
    Given VP try to set "set password with less than 5 char"

  @protsiuk_scenario_8
  Scenario: VP try to set password with more then 32 char
    Given VP try to set "set password with more then 32 char"

  @protsiuk_scenario_9
  Scenario: VP try to set try to confirm invalid new password
    Given VP try to set "try to confirm invalid new password"

    #  @protsiuk_scenario_10
#  Scenario: VP try to set invalid old password_3
#    Given VP try to set "invalid old password"





























