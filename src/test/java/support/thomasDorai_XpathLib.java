package support;

public class thomasDorai_XpathLib
{
    public static String registrationUrl="http://ask-stage.portnov.com/#/registration";
    public static String loginUrl="http://ask-stage.portnov.com/#/login";
    public static String emailField = "//input[@formcontrolname='email']";
    public static String passwordField = "//input[@formcontrolname='password']";
    public static String signInButton = "//*[contains(text(),'Sign In')]";
    public static String groupField = "//input[@ formcontrolname='group']";
    public static String firstNameField = "//input[@formcontrolname='firstName']";
    public static String lastNameField = "//input[@formcontrolname='lastName']";
    public static String confirmPasswordField = "//input[@formcontrolname='confirmPassword']";
    public static String registerButton = "//*[text()='Register Me']";

    public static String roleStudent = "//div[@class='info']//p";
    public static String roleTeacher = "//div[@class='info']//p";

    public static String validEmailError = "//mat-error[contains(text(),'Should be a valid email address')]";
    public static String requiredFieldError = "//mat-error[text()='This field is required']";

    public static String quizzesMenu = "//h5[contains(text(),'Quizzes')]";
    public static String createNewQuizButton = "//span[contains(text(),'Create New Quiz')]";
    public static String listOfQuizzes = "//h4[contains(text(),'List of Quizzes')]";
    public static String quizTitleField = "//input[@formcontrolname='name']";
    public static String addQuestionButton = "//span[contains(.,'Add Question')]";
    public static String textualRadioButton1 = "//*[contains(text(),'Q1')]/../../..//mat-radio-button[1]";
    public static String textAreaField = "//*[contains(text(),'Q1')]/../../..//textarea";
}