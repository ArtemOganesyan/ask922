package support;

public class ProtsiukXpathLib {
    public static String teacherEmailField_xpathlib = "//input[@formcontrolname='email']";
    public static String passwordField_xpathlib = "//input[@formcontrolname='password']";
    public static String loginButton_xpathlib = "//button[@type='submit']";

    public static String controlName_xpathlib = "//h3[contains(text(),'VitProtStudentTeacher')]";
    public static String quizzesButton_xpathlib = "//h5[contains(text(),'Quizzes')]";
    public static String listOfQuizzesButton_xpathlib = "//h4[contains(text(),'List of Quizzes')]";
    public static String createNewQuizButton_xpathlib = "//span[contains(text(),'Create New Quiz')]";
    public static String addQuestionButton_xpathlib = "//span[@class='mat-button-wrapper' and contains(., 'Add Question')]";
    public static String selectTextualQuestion_xpathlib = "//div[@class='mat-radio-label-content' and contains(., 'Textual')]";
    public static String textualQuestionTitle_xpathlib = "//textarea[@formcontrolname='question']";
    public static String showStopper_xpathlib = "//span[contains(text(), 'Show-Stopper')]";


}
