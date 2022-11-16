@ryabchikova_feature
Feature: ER test set create new assignment

  @ryabchikova_scenario1
  Scenario: ER create new assignment
    Given ER navigate to log in page
    Then ER fill out "Email" textfield
    Then ER fill out "Password" textfield
    And ER click on "Sign In" button
    Then ER click on "Assignments" from navigation menu
    And ER click on "Create New Assignment" button
    Then ER click on "Group Filter" textfield
    And ER click on "A" textfield
    Then ER click on "Select Quiz to Assign" textfield
    And ER click on "QA2 cxx" textfield
    Then ER click on "Eva R" textfield
    And ER click on "Give Assignment" button










