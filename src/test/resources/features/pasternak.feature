@pasternak_feature
  Feature: Pasternak feature

    @pasternak_test1
    Scenario: Pasternak verifies that user can change password
      Given PVZ open URL ""
      And PVZ wait for 3 sec
      Then PVZ login to the app
      And PVZ wait for 3 sec
      Then PVZ role should be displayed
      And PVZ wait for 3 sec
      
      And PVZ wait for element with xpath "//h5[text() = 'Settings']" to be present
      Then PVZ click on element with xpath "//h5[contains(text(),'Settings')]"
      Then PVZ click on element with xpath "//span[contains(text(),'Change Your Password')]"
      And PVZ type "Lviv9" into element with xpath "//input[@formcontrolname='password']"
      And PVZ type "Lviv1" into element with xpath "//input[@formcontrolname='newPassword']"
      And PVZ type "Lviv1" into element with xpath "//input[@formcontrolname='confirmPassword']"
      Then PVZ click on element with xpath "//span[text()='Change']"
      Then PVZ wait for 3 sec
      Then PVZ click on element with xpath "//h5[contains(text(),'Log Out')]"
      And PVZ click on element with xpath "//span[contains(text(),'Log Out')]"
      And PVZ wait for 2 sec
      When PVZ open URL ""
      Then PVZ with changed password login to the app
      And PVZ wait for element with xpath "//h5[text() = 'Settings']" to be present
      Then PVZ click on element with xpath "//h5[contains(text(),'Settings')]"
      Then PVZ click on element with xpath "//span[contains(text(),'Change Your Password')]"
      And PVZ type "Lviv1" into element with xpath "//input[@formcontrolname='password']"
      And PVZ type "Lviv9" into element with xpath "//input[@formcontrolname='newPassword']"
      And PVZ type "Lviv9" into element with xpath "//input[@formcontrolname='confirmPassword']"
      And PVZ wait for element with xpath "//span[text() = 'Change']" to be present
      Then PVZ click on element with xpath "//span[text()='Change']"
      Then PVZ wait for 10 sec
      Then PVZ click on element with xpath "//h5[contains(text(),'Log Out')]"
      And PVZ click on element with xpath "//span[contains(text(),'Log Out')]"

    @pasternak_test2
    Scenario: Pasternak verifies that Graded By option is available
      Given PVZ open URL ""
      Then PVZ wait for 3 sec
      When PVZ type "vasylyna9@mail.ru" into element with xpath "//input[@formcontrolname='email']"
      And PVZ type "Lviv9" into element with xpath "//input[@formcontrolname='password']"
      And PVZ click on element with xpath "//*[contains(text(), 'Sign In')]"
      And PVZ wait for element with xpath "//h3[contains(text(),'Lev Pasternak')]" to be present
      And PVZ click on element with xpath "//a[3]"
      Then PVZ wait for element with xpath "//*[contains(text(),'Graded By')]" to be present
