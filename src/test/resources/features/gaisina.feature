@ gaisina new feature
Feature: GLB Single choice quiz text field
  Background:
    Given GLB open url "http://ask-stage.portnov.com/#/login"
    Then GLB wait for element with xpath "//span[contains(text(),'Sign In')]" to be present
    Then GLB type "galibu552@gmail.com" into element with xpath "//input[@formcontrolname='email']"
    Then GLB type "qwerty66" into element with xpath "//input[@formcontrolname='password']"
    And GLB click on element with xpath "//span[contains(text(),'Sign In')]"
    Then GLB wait for element with xpath "//p[contains(text(),'TEACHER')]" to be present
    Then GLB click on element with xpath "//h5[contains(text(),'Quizzes')]"
    Then GLB wait for element with xpath "//h4[contains(text(),'List of Quizzes')]" to be present
    Then GLB click on element with xpath "//span[contains(text(),'Create New Quiz')]"
    And GLB wait for 5 sec

  @GLB_test1
  Scenario: GLB 1 Special character in question text field
    Then GLB click on element with xpath "//input[@formcontrolname='name']"
    And GLB wait for 3 sec
    And GLB type "1a/1" into element with xpath "//input[@formcontrolname='name']"
    Then GLB click on element with xpath "//mat-icon[contains(text(),'add_circle')]"
    Then GLB click on element with xpath "//div[contains(text(),'Single-Choice')]"
    And GLB wait for 3 sec
    Then GLB type "/" into element with xpath "//textarea[@formcontrolname='question']"
    And GLB type "1a/" into element with xpath "//textarea[@placeholder='Option 1*']"
    And GLB type "1a//" into element with xpath "//textarea[@placeholder='Option 2*']"
    Then GLB click on element with xpath "(//*[contains(text(),'Q1')]/../../..//mat-radio-button)[4]"
    Then GLB wait for 3 sec
    And GLB click on element with xpath "//span[contains(text(),'Save')]"
    Then GLB wait for 3 sec
    Then GLB wait for element with xpath "//mat-panel-title[contains(text(),'1a/1')]" to be present
    Then GLB wait for 3 sec

  @GLB_test2
  Scenario: GLB 1 Special character in option 1 text field
    Then GLB click on element with xpath "//input[@formcontrolname='name']"
    And GLB wait for 3 sec
    And GLB type "1a/2" into element with xpath "//input[@formcontrolname='name']"
    Then GLB wait for 3 sec
    Then GLB click on element with xpath "//mat-icon[contains(text(),'add_circle')]"
    Then GLB click on element with xpath "//div[contains(text(),'Single-Choice')]"
    And GLB wait for 3 sec
    Then GLB type "1a/" into element with xpath "//textarea[@formcontrolname='question']"
    And GLB type "/" into element with xpath "//textarea[@placeholder='Option 1*']"
    And GLB type "1a//" into element with xpath "//textarea[@placeholder='Option 2*']"
    Then GLB click on element with xpath "(//*[contains(text(),'Q1')]/../../..//mat-radio-button)[4]"
    Then GLB wait for 3 sec
    And GLB click on element with xpath "//span[contains(text(),'Save')]"
    Then GLB wait for 3 sec
    Then GLB wait for element with xpath "//mat-panel-title[contains(text(),'1a/2')]" to be present
    Then GLB wait for 3 sec