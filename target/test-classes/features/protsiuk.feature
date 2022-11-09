@predefined
Feature: Teacher: Create Assignment
#
  @predefined_1
  Scenario: Create Quiz
  Given I login as a "teacher"
#    Given Login as a Teacher "3" and "3"

#
#    # Create Quiz
#      #Login
#    Given I open url "http://ask-stage.portnov.com"
#    Then I should see page title as "Assessment Control @ Portnov"
#    And I wait for element with xpath "//button[@type='submit']" to be present
#    When I type "thamilinylove@wuupr.com" into element with xpath "//input[@formcontrolname='email']"
#    And I type "123456Aa" into element with xpath "//input[@formcontrolname='password']"
#    Then I click on element using JavaScript with xpath "//button[@type='submit']"
#    And I wait for element with xpath "//h3[contains(text(),'VitProtStudentTeacher')]" to be present
#    Then I wait for 1 sec
#      #Redirect to Quizzes
#    And  I mouse over element with xpath "//h5[contains(text(),'Quizzes')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//h5[contains(text(),'Quizzes')]"
#    And I wait for element with xpath "//h4[contains(text(),'List of Quizzes')]" to be present
#    And I wait for 1 sec
#      # Create Quiz
#    And I click on element with xpath "//span[contains(text(),'Create New Quiz')]"
#    And I wait for 1 sec
#    When I type "For Perfecto 22" into element with xpath "//input[@placeholder='Title Of The Quiz *']"
#    And I wait for 1 sec
#      # Create First Question Textual
#    And  I mouse over element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 2 sec
#    And I click on element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//mat-expansion-panel [ .//*[contains(text(), 'Q1')] ]" to be present
#    And I wait for 1 sec
#    And I click on element with xpath "//div[@class='mat-radio-label-content' and contains(., 'Textual')]"
#    And I wait for 1 sec
#    When I type "How much is 2 + 3" into element with xpath "//textarea[@formcontrolname='question']"
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(), 'Show-Stopper')]"
#    And I wait for 1 sec
#      #Create Second Question Single
#    And  I mouse over element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 2 sec
#    And I click on element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//mat-expansion-panel [ .//*[contains(text(), 'Q2')] ]" to be present
#    And I wait for 1 sec
#    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//div[contains(text(), 'Single')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//*[contains(text(), 'Q2')]/../../..//label[contains(text(), 'Question *')]" to be present
#    And I wait for 1 sec
#    Then I type "Select 2" into element with xpath "//*[contains(text(), 'Q2')]/../../..//textarea[@formcontrolname='question']"
#    And I wait for 1 sec
#
#    Then  I type "2" into element with xpath "//*[contains(text(), 'Q2')]/../../.. //textarea[@placeholder = 'Option 1*']"
#    And I wait for 1 sec
#    When I type "1" into element with xpath "//*[contains(text(), 'Q2')]/../../.. //textarea[@placeholder = 'Option 2*']"
#    And I wait for 1 sec
#     #Select Answer
#    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//mat-radio-group[2]//mat-radio-button"
#    And I wait for 3 sec
#      #Add Option for Second Question
#    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//span[contains(text(), 'Add Option')]"
#    And I wait for 1 sec
#    When I type "3" into element with xpath "//*[contains(text(), 'Q2')]/../../.. //textarea[@placeholder = 'Option 3*']"
#    And I wait for 1 sec
#      #Move first option down
#    And I click on element with xpath "//*[contains(text(), 'Q2')]/../../..//mat-radio-group[1]//mat-icon"
#    And I wait for 2 sec
#    And  I mouse over element with xpath "//span[contains(text(),'Move option down')]"
#    And I wait for 2 sec
#    And I click on element with xpath "//span[contains(text(),'Move option down')]"
#    And I wait for 2 sec
#      #Third Question Multiple
#    And  I mouse over element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 2 sec
#    And I click on element with xpath "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//mat-expansion-panel [ .//*[contains(text(), 'Q3')] ]" to be present
#    And I wait for 1 sec
#    And I click on element with xpath "//*[contains(text(), 'Q3')]/../../..//div[contains(text(), 'Multiple')]"
#    And I wait for 1 sec
#    When I type "Select A and B" into element with xpath "//*[contains(text(), 'Q3')]/../../..//textarea[@formcontrolname='question']"
#    And I wait for 1 sec
#    When I type "A" into element with xpath "//*[contains(text(), 'Q3')]/../../.. //textarea[@placeholder = 'Option 1*']"
#    And I wait for 1 sec
#    When I type "B" into element with xpath "//*[contains(text(), 'Q3')]/../../.. //textarea[@placeholder = 'Option 2*']"
#    And I wait for 1 sec
#      #Add Option
#    And I click on element with xpath "//*[contains(text(), 'Q3')]/../../..//span[contains(text(), 'Add Option')]"
#    And I wait for 1 sec
#    When I type "C" into element with xpath "//*[contains(text(), 'Q3')]/../../.. //textarea[@placeholder = 'Option 3*']"
#    And I wait for 1 sec
#      #Select Answer
#    And I click on element with xpath "//label[@for = 'mat-checkbox-5-input']"
#    And I wait for 1 sec
#    And I click on element with xpath "//label[@for = 'mat-checkbox-6-input']"
#    And I wait for 1 sec
#      #Return to First Question
#    And I click on element with xpath "//*[contains(text(), 'Q1')] "
#    And I wait for 2 sec
#    And  I clear element with xpath "//*[contains(text(), 'Q1')] /../../..//textarea[@formcontrolname='question']"
#    And I wait for 2 sec
#    When I type "How much is 2 + 2" into element with xpath "//*[contains(text(), 'Q1')] /../../..//textarea[@formcontrolname='question']"
#    And I wait for 1 sec
#      #Save Quiz
#    And I click on element with xpath "//span[contains(text(),'Save')]"
#    And I wait for 1 sec
#      #Log Out
##    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
##    And I wait for element with xpath "//h1[contains(text(),'Confirmation')]" to be present
##    And I wait for 1 sec
##    And I click on element with xpath "//span[contains(text(),'Log Out')]"
##    And I wait for 4 sec
#
#    # Create Assignment
#      #Login as a Teacher
##    When I type "thamilinylove@wuupr.com" into element with xpath "//input[@formcontrolname='email']"
##    And I type "123456Aa" into element with xpath "//input[@formcontrolname='password']"
##    Then I click on element using JavaScript with xpath "//button[@type='submit']"
##    And I wait for element with xpath "//h3[contains(text(),'VitProtStudentTeacher')]" to be present
##    Then I wait for 1 sec
#      #Go to Assignments
#    And I click on element with xpath "//h5[contains(text(),'Assignments')]"
#    And I wait for element with xpath "//h4[contains(text(),'List of Assignments')]" to be present
#    And I wait for 1 sec
#    And I click on element with xpath "//button[@class = 'mat-raised-button mat-primary']"
#    And I wait for element with xpath "//h4[contains(text(),'Give Assignment')]" to be present
#    And I wait for 1 sec
#      #Select Student
#    Then I scroll to the element with xpath "//div[@class='mat-list-text' and contains(., 'Perfecto')]" with offset 1
#    And I wait for 1 sec
#    And  I mouse over element with xpath "//div[@class='mat-list-text' and contains(., 'Perfecto')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//div[@class='mat-list-text' and contains(., 'Perfecto')]"
#    And I wait for 2 sec
#      #Give Assignment
#    Then I scroll to the element with xpath "//h4[contains(text(),'Give Assignment')]" with offset 1
#    And I wait for 1 sec
#    And  I mouse over element with xpath "//span[contains(text(),'Select Quiz To Assign')]"
#    And I wait for 1 sec
#    And I click on element with xpath "  //span[contains(text(),'Select Quiz To Assign')]"
#    And I wait for 1 sec
#      #Select Quiz
#    Then I scroll to the element with xpath "//span[contains(text(),'For Perfecto 22')]" with offset 1
#    And I wait for 1 sec
#    And  I mouse over element with xpath "//span[contains(text(),'For Perfecto 22')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(),'For Perfecto 22')]"
#    And I wait for 1 sec
#    Then I scroll to the element with xpath "//span[contains(text(),'Give Assignment')]" with offset 1
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(),'Give Assignment')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//h4[contains(text(),'List of Assignments')]" to be present
#    And I wait for 1 sec
#      #Log Out
#    And  I mouse over element with xpath "//h5[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
#    And I wait for element with xpath "//h1[contains(text(),'Confirmation')]" to be present
#    And I wait for 1 sec
#    And  I mouse over element with xpath "//span[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(),'Log Out')]"
#    And I wait for 4 sec
#
#  @predefined_2
#  Scenario: Check Assignment
#    # Check Assignment
#
#      #Login as a Student
#    Given I open url "http://ask-stage.portnov.com"
#    Then I should see page title as "Assessment Control @ Portnov"
#    And I wait for element with xpath "//button[@type='submit']" to be present
#    When I type "kolianzidan1@squaresilk.com" into element with xpath "//input[@formcontrolname='email']"
#    And I type "123456Aa" into element with xpath "//input[@formcontrolname='password']"
#    Then I click on element using JavaScript with xpath "//button[@type='submit']"
#    And I wait for element with xpath "//h3[contains(text(),'Perfecto')]" to be present
#    Then I wait for 1 sec
#      #Go to Assignments
#    And  I mouse over element with xpath "//span[contains(text(),'Go To My Assignments')]"
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(),'Go To My Assignments')]"
#    And I wait for 1 sec
#    And I wait for element with xpath "//h4[contains(text(),'My Assignments')]" to be present
#    And I wait for 1 sec
##    And I scroll to the element with xpath "//td[contains(text(),'For Perfecto 22')]" with offset 1
##    And I wait for 1 sec
##    And I wait for element with xpath "//td[contains(text(),'For Perfecto 22')]" to be present
##    And I wait for 1 sec
#    #Answer 1
#    And I click on element with xpath "//tr[@class = 'ng-star-inserted'][1] //a"
#    And I wait for 3 sec
#    And  I type "2,5" into element with xpath "//textarea[@placeholder =  'Enter your answer']"
#    And I wait for 1 sec
#    #Answer 2
#    And  I scroll to the element with xpath "//h5[contains(text(), 'Question 2 / 3')]/..//mat-radio-button[2]//label" with offset 1
#    And I wait for 1 sec
#    And  I click on element with xpath "//h5[contains(text(), 'Question 2 / 3')]/..//mat-radio-button[2]//label"
#    And I wait for 1 sec
#    #Answer 3
#    And  I scroll to the element with xpath "//h5[contains(text(),  'Question 3 / 3')]/..//label[@for='mat-checkbox-1-input']" with offset 1
#    Then I wait for 1 sec
#    Then I click on element using JavaScript with xpath "//h5[contains(text(),  'Question 3 / 3')]/..//label[@for='mat-checkbox-1-input']"
#    Then I wait for 1 sec
#    And  I scroll to the element with xpath "//h5[contains(text(),  'Question 3 / 3')]/..//label[@for='mat-checkbox-2-input']" with offset 1
#    Then I click on element using JavaScript with xpath "//h5[contains(text(),  'Question 3 / 3')]/..//label[@for='mat-checkbox-2-input']"
#    And  I wait for 1 sec
#    #Submit answers
#    And I scroll to the element with xpath "//span[contains(text(), 'Submit My Answers')]" with offset 1
#    And I wait for 1 sec
#    And I click on element with xpath "//span[contains(text(), 'Submit My Answers')]"
##    And I accept alert
#    And  I wait for 2 sec
#    And I click on element with xpath "//button[@aria-label='Close dialog']"
#    And  I wait for 1 sec
#      #Log Out
#    And  I mouse over element with xpath "//h5[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    Then I click on element using JavaScript with xpath "//h5[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    And  I mouse over element with xpath "//span[contains(text(),'Log Out')]"
#    And I wait for 1 sec
#    Then I click on element using JavaScript with xpath "//span[contains(text(),'Log Out')]"
#    Then I wait for 1 sec




