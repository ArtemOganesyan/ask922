@adamokova_feature1

  Feature: BA test set for Homepage links

   Scenario: BA- scenario for Student page-My Assignments link

     Given BA login as a student
     Then BA click to "assignments"

  Scenario: BA- scenario for Student page- My Grades link

     Given BA login as a student
     Then BA click to "grades"

  Scenario: BA- scenario for Teacher page- Go To Submissions link
     Given BA login as a teacher
     Then BA click to "submissions"

  Scenario: BA - scenario for Teacher page- Go To Assignments ink
    Given BA login as a teacher
    Then BA click to "teacher assignments"

  Scenario: BA- scenario for Teacher page- Go To Users Management link
    Given BA login as a teacher
    Then BA click to "users management"
















