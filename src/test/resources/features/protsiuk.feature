@predefined
Feature: Teacher: Setting password

  @predefined_1
  Scenario: Change Password Happy Path
  Given I login as "teacher" 'teacher' or 'student' or 'newPasswordTeacher'
  Given I set "new" password 'old or 'new'
  Given I Log Out

  @predefined_2
  Scenario: Return Password Happy Path
  Given I login as "newPasswordTeacher" 'teacher' or 'student' or 'newPasswordTeacher'
  Given I set "old" password 'old or 'new'
  Given I Log Out





















