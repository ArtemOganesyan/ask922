@MusinaK_feature
Feature: MK My test set with step definitions. Submission - reviewed

  Background:
    And MK login to application
    Then MK wait for 3 sec
  @MK_test_1
  Scenario: MK Make sure Review button clickable and navigate to the review page
    And MK go to Submissions - Reviewed
    Then MK wait for 3 sec
    Then MK find MK test submission and click on Review button
    Then MK verify that Review Submission page displayed

  @MK_test_2
  Scenario: MK Verify that changes in "Teacher comment" field saved
    And MK go to Submissions - Reviewed
    Then MK find MK test submission and click on Review button
    Then MK wait for 5 sec
    Then MK navigate to the Teacher comment field and clear existing comment
    Then MK wait for 2 sec
#      Then I refresh the page
#      Then I wait for 2 sec
#      Then I go to Submissions - Reviewed
#      Then I find MK test submission and click on Review button
    Then MK navigate to the Teacher comment field and type "abc" and Save
    Then MK wait for 5 sec
    Then MK find MK test submission and click on Review button
    Then MK wait for 5 sec
    Then MK verify that Teacher Comment "abc" was saved

  @MK_test_3
  Scenario: MK Verify that reviewed assignments replaced from Automatically Graded to Reviewed and saved
    Then MK go to Submissions - Automatically Graded
    Then MK choose first graded submission and click , add comment save and find this submission on Reviewed page
    Then MK verify that Reviewed Submission replaced to the Reviewed page and comment saved







