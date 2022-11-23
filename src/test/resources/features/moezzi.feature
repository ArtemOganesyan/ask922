@pre_defined
 Feature: Tests
        @pre_defined1
             Scenario: student's name

             Given SM open url "http://ask-stage.portnov.com"
             Then SM wait for 3 sec
             Then SM type "abc@yahoo.com" into element with xpath "//input[@formcontrolname='email']"
             Then SM type "111111" into element with xpath "//input[@formcontrolname='password']"
             And SM click on element with xpath "//*[contains(text(), 'Sign In')]"
             Then SM wait for 5 sec
             Then SM click on element with xpath "//h5[contains(text(),'Settings')]"
             Then SM wait for 3 sec
             Then SM click on element with xpath "//span[contains(text(),'Change Your Name')]"
             Then SM clear element with xpath "//input[@formcontrolname='name']"
             Then SM type "Red" into element with xpath "//input[@formcontrolname='name']"
             Then SM click on element with xpath "//span[text()='Change']"
             Then SM wait for 3 sec
             Then SM click on element with xpath "//span[contains(text(),'Change Your Password')]"
             Then SM wait for 3 sec
             Then SM type "111111" into element with xpath "//input[@formcontrolname='password']"
             Then SM type "111111" into element with xpath "//input[@formcontrolname='newPassword']"
             Then SM type "111111" into element with xpath "//input[@formcontrolname='confirmPassword']"
             And SM click on element with xpath "//span[text()='Change']"
             Then SM wait for 3 sec
             Then SM click on element with xpath "//h5[contains(text(),'Log Out')]"
             Then SM wait for 3 sec
             Then element with xpath "//h1[text()='Confirmation']" should contain text "Confirmation"
             Then element with xpath "//p[contains(text(),'Are you sure want to Log Out?')]" should contain text "Are you sure want to Log Out?"
             And SM click on element with xpath "//span[contains(text(),'Log Out')]"
             Then SM wait for 3 sec
         @pre_defined0
              Scenario: registration
              Given SM navigate to url
              And SM fill out all required field
         @pre_defined2
              Scenario: MY test
              Given SM test login




