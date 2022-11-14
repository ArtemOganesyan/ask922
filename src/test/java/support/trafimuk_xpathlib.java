package support;

public class trafimuk_xpathlib {
    public static String url = "http://ask-stage.portnov.com";
    public static String emailField = "//input[@formcontrolname='email']";
    public static String passwordField = "//input[@formcontrolname='password']";
    public static String signInButton = "//button[@type='submit']";
    public static String menuQuizzes = "//h5[contains(text(),'Quizzes')]";
    public static String newQuizButton = "//span[contains(text(),'Create New Quiz')]";
    public static String quizzTitle = "//input[@formcontrolname='name']";
    public static String addQbutton ="//mat-icon[contains(text(),'add_circle')]";
    public static String qTypeMC ="//*[contains(text(),'Q1')]/../../..//*[contains(text(),'Multiple')]";
    public static String questionField ="//*[contains(text(),'Q1')]/../../..//*[@placeholder='Question *']";
    public static String option1Field ="//*[contains(text(),'Q1')]/../../..//*[@placeholder='Option 1*']";
    public static String option2Field ="//*[contains(text(),'Q1')]/../../..//*[@placeholder='Option 2*']";
    public static String checkbox1 = "(//*[contains(text(),'Q1')]/../../..//mat-checkbox)[1]";
    public static String saveButton = "//span[contains(text(),'Save')]";
    public static String reqFieldErrorMsg = "(//mat-error[@role='alert'])[1]";
}
