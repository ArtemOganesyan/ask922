@pasternak_feature
  Feature: Pasternak feature

    @pasternak_test1
    Scenario: Pasternak test scenario
      Given PVZ open URL ""
      And I wait for 3 sec
      Then I login to the app
      And I wait for 3 sec
      Then the user role should be displayed
And I wait for 3 sec
      
      And I wait for element with xpath "//h5[text() = 'Settings']" to be present
      Then I click on element with xpath "//h5[contains(text(),'Settings')]"
      Then I click on element with xpath "//span[contains(text(),'Change Your Password')]"
      And I type "Lviv9" into element with xpath "//input[@formcontrolname='password']"
      And I type "Lviv1" into element with xpath "//input[@formcontrolname='newPassword']"
      And I type "Lviv1" into element with xpath "//input[@formcontrolname='confirmPassword']"
      Then I click on element with xpath "//span[text()='Change']"
      Then I wait for 10 sec
      Then I click on element with xpath "//span[contains(text(),'Change Your Password')]"
      And I type "Lviv1" into element with xpath "//input[@formcontrolname='password']"
      And I type "Lviv9" into element with xpath "//input[@formcontrolname='newPassword']"
      And I type "Lviv9" into element with xpath "//input[@formcontrolname='confirmPassword']"
      And I wait for element with xpath "//span[text() = 'Change']" to be present
      Then I click on element with xpath "//span[text()='Change']"
      Then I wait for 10 sec
      Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
      And I click on element with xpath "//span[contains(text(),'Log Out')]"
