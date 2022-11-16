package support;

public class ProtsiukXpathLib {
    public static String askURL_xpathLib = "http://ask-stage.portnov.com";
    public static String teacherEmailField_xpathlib = "//input[@formcontrolname='email']";
    public static String teacherPasswordField_xpathlib = "//input[@formcontrolname='password']";
    public static String loginButton_xpathlib = "//button[@type='submit']";
    public static String lodOutButton_xpathLib = "//h5[contains(text(),'Log Out')]";
    public static String lodOutConfirmationButton_xpathLib = "//span[contains(text(),'Log Out')]";
    public static String settingButton_xpathLib = "//h5[contains(text(),'Settings')]";
    public static String changeYourPasswordButton_xpathLib = "//span[contains(text(),'Change Your Password')]";
    public static String changingPasswordButton_xpathLib = "//h1[contains(text(), 'Changing')]";
    public static String changingPasswordPasswordField_xpathLib = "//input[@formcontrolname='password']";
    public static String changingPasswordNewPasswordField_xpathLib = "//input[@formcontrolname='newPassword']";
    public static String changingPasswordConfirmNewPasswordField_xpathLib = "//input[@formcontrolname='confirmPassword']";
    public static String changingPasswordConfirmationButton_xpathLib = "//span[text() = 'Change']";
    public static String changingPasswordConfirmationCancelButton_xpathLib = "//span[text() = 'Cancel']";
    public static String whitespacesAreNotAllowed = "///mat-error[contains(text(), 'Whitespace')]";


    //    And I click on element with xpath "//h5[contains(text(),'Log Out')]"
//            #    And I wait for element with xpath "//h1[contains(text(),'Confirmation')]" to be present
//#    And I wait for 1 sec
//#    And I click on element with xpath "//span[contains(text(),'Log Out')]"






    public static String controlName_xpathlib = "//h3[contains(text(),'VitProtStudentTeacher')]";
    public static String quizzesButton_xpathlib = "//h5[contains(text(),'Quizzes')]";
    public static String listOfQuizzesButton_xpathlib = "//h4[contains(text(),'List of Quizzes')]";
    public static String createNewQuizButton_xpathlib = "//span[contains(text(),'Create New Quiz')]";
    public static String addQuestionButton_xpathlib = "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]";
    public static String selectTextualQuestion_xpathlib = "//div[@class='mat-radio-label-content' and contains(., 'Textual')]";
    public static String textualQuestionTitle_xpathlib = "//textarea[@formcontrolname='question']";
    public static String showStopper_xpathlib = "//span[contains(text(), 'Show-Stopper')]";




//    public static String emailField = "//input[@formcontrolname = 'email']";
//    public static String passwordfield = "//input[@formcontrolname = 'password']";
//    public static String loginButton = "//*[text() = 'Sign In']";
//    public static String userRole = "//div[@class='info']//p";
//    public static String quizzesButton = "//h5[contains(text(), 'Quizzes')]";
//    public static String createNewQuizButton = "//span[contains(text(), 'Create New Quiz')]";
//    public static String quizTitle = "//input[contains(@placeholder, 'Title Of The Quiz')]";
//    public static String addQuestionButton = "//button [.//*[contains(., 'Add Question')]]";
//    public static String previewButton = "//span[contains(text(), 'Preview')]";
//    public static String role = "//p[contains(text(), 'TEACHER')]";
//    public static String thisFieldIsRequired = "//mat-error[contains(text(), 'This field is required')]";
//    public static String lengthError = "//mat-error";
//    public static String textualChoice = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//label[ .//*[contains(., 'Textual')]]";
//    public static String textualQuestion = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//textarea[contains(@placeholder, 'Question *')]";
//    public static String questionSaveButton = "//span[contains(text(), 'Save')]";


}
