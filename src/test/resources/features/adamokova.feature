    @adamokova_feature1

  Feature: BA test set for Homepage links

    @adamokova-test1
   Scenario: BA- scenario for Student page-My Assignments link
     Given BA login as a student
     Then BA click to "assignments"

    @adamokova-test2
  Scenario: BA- scenario for Student page- My Grades link
     Given BA login as a student
     Then BA click to "grades"

    @adamokova-test3
  Scenario: BA- scenario for Teacher page- Go To Submissions link
     Given BA login as a teacher
     Then BA click to "submissions"

    @adamokova-test4
  Scenario: BA - scenario for Teacher page- Go To Assignments ink
    Given BA login as a teacher
    Then BA click to "teacher assignments"

    @adamokova-test5
  Scenario: BA- scenario for Teacher page- Go To Users Management link
    Given BA login as a teacher
    Then BA click to "users management"
















