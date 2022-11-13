@ryabchikova_feature
Feature: Ryabchikova feature

  @ryabchikova_test1
  Scenario: Create new assignment
    Given I open url ""
    Then I fill out "Email" textfield
    Then I fill out "Password" textfield
    And I click on "Sign In" button
    Then I click on "Assignments" from navigation menu
    And I click on "Create New Assignment" button
    Then I click on "Group Filter" textfield










#    Then I open url "http://ask-stage.portnov.com"
#    Then I type "genyarr2@gmail.com" into element with xpath "//input[@formcontrolname='email']"
#    Then I type "genyarr2!" into element with xpath "//input[@formcontrolname='password']"
#    When I click on element with xpath "//*[contains(text(), 'Sign In')]"
#    Then I should see page title as "Assessment Control @ Portnov"
#    And I wait for 1 sec
#    Then I click on element with xpath "//h5[contains(text(),'Assignments')]"
#    And I wait for 3 sec
#    When I click on element with xpath "//span[contains(text(),'Create New Assignment')]"
#    And I wait for 3 sec
#  Then I click on element using JavaScript with xpath "//*[@formcontrolname='groupFilter']"
#    Then I scroll to the element with xpath "//div/span[contains(text(),'A')]" with offset 8
#    Then I click on element using JavaScript with xpath "//div/span[contains(text(),'A')]"
#    Then I click on element using JavaScript with xpath "//*[@formcontrolname='quizId']"
#    Then I scroll to the element with xpath "//span[contains(text(),'cxx')]" with offset 4
#    And I click on element using JavaScript with xpath "//span[contains(text(),'cxx')]"
#    Then I click on element using JavaScript with xpath "//text()[contains(.,'Eva R')]/../../mat-pseudo-checkbox"
#    Then I click on element using JavaScript with xpath "//span[contains(text(),'Give Assignment')]"
#    And I wait for 3 sec
#    Then element with xpath "//h4[contains(text(),'List of Assignments')]" should be displayed

