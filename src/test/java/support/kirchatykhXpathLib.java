package support;

public class kirchatykhXpathLib {
    public static String emailField = "//input[@formcontrolname = 'email']";
    public static String passwordfield = "//input[@formcontrolname = 'password']";
    public static String loginButton = "//*[text() = 'Sign In']";
    public static String userRole = "//div[@class='info']//p";
    public static String quizzesButton = "//h5[contains(text(), 'Quizzes')]";
    public static String createNewQuizButton = "//span[contains(text(), 'Create New Quiz')]";
    public static String quizTitle = "//input[contains(@placeholder, 'Title Of The Quiz')]";
    public static String addQuestionButton = "//button [.//*[contains(., 'Add Question')]]";
    public static String previewButton = "//span[contains(text(), 'Preview')]";
    public static String role = "//p[contains(text(), 'TEACHER')]";
    public static String thisFieldIsRequired = "//mat-error[contains(text(), 'This field is required')]";
    public static String lengthError = "//mat-error";
    public static String textualChoice = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//label[ .//*[contains(., 'Textual')]]";
    public static String textualQuestion = "//mat-expansion-panel[ .//*[contains(text(), 'Q1')]]//textarea[contains(@placeholder, 'Question *')]";
    public static String questionSaveButton = "//span[contains(text(), 'Save')]";
}
