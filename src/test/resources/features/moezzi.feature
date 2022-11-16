@pre_defined
 Feature: Tests
        @pre_defined1
             Scenario: student's name
             Given I open url "http://ask-stage.portnov.com"
             Then I wait for 3 sec
             Then I type "abc@yahoo.com" into element with xpath "//input[@formcontrolname='email']"
             Then I type "111111" into element with xpath "//input[@formcontrolname='password']"
             And I click on element with xpath "//*[contains(text(), 'Sign In')]"
             Then I wait for 3 sec
             Then I click on element with xpath "//h5[contains(text(),'Settings')]"
             Then I wait for 3 sec
             Then I click on element with xpath "//span[contains(text(),'Change Your Name')]"
             Then I clear element with xpath "//input[@formcontrolname='name']"
             Then I type "Red" into element with xpath "//input[@formcontrolname='name']"
             Then I click on element with xpath "//span[text()='Change']"
             Then I wait for 3 sec
             Then I click on element with xpath "//span[contains(text(),'Change Your Password')]"
             Then I wait for 3 sec
             Then I type "111111" into element with xpath "//input[@formcontrolname='password']"
             Then I type "111111" into element with xpath "//input[@formcontrolname='newPassword']"
             Then I type "111111" into element with xpath "//input[@formcontrolname='confirmPassword']"
             And I click on element with xpath "//span[text()='Change']"
             Then I wait for 3 sec
             Then I click on element with xpath "//h5[contains(text(),'Log Out')]"
             Then I wait for 3 sec
             Then element with xpath "//h1[text()='Confirmation']" should contain text "Confirmation"
             Then element with xpath "//p[contains(text(),'Are you sure want to Log Out?')]" should contain text "Are you sure want to Log Out?"
             And I click on element with xpath "//span[contains(text(),'Log Out')]"
             Then I wait for 3 sec
         @pre_defined0
              Scenario: registration
              Given I navigate to url
              And I fill out all required field
         @pre_defined2
              Scenario: MY test
              Given I test login




