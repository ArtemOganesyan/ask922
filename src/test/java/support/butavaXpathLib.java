package support;

public class butavaXpathLib {
    public static String askURL = "http://ask-stage.portnov.com";

    public static String askTEmail = "77422@mexcool.com";

    public static String askTPass = "portnov1234";

    public static String emailFieldXpath = "//input[@formcontrolname='email']";

    public static String passFieldXpath = "//input[@formcontrolname='password']";

    public static String singInButtonXpath = "//*[contains(text(), 'Sign In')]";

    public static String menuQuizzesXpath = "//h5[contains(text(),'Quizzes')]";

    public static String newQuizButtonXpath = "//span[contains(text(),'Create New Quiz')]";

    public static String roleXpath = "//p[contains(text(),'TEACHER')]";
    //"//div[@class='info']//p"

    public static String myQuizTitleXpath = "//input[@formcontrolname='name']";

    public static String quizTitle = "sv:quizgit";

    public static String addQnXpath = "//mat-icon[contains(text(),'add_circle')]";

    public static String sChoiceTypeXpath = "//div[contains(text(),'Single-Choice')]";

    public static String qnXpath = "//textarea[@formcontrolname='question']";
    public static String qn = "0000+0001";

    public static String optionOneXpath = "//textarea[@placeholder='Option 1*']";

    public static String optionOneAnswer = "0001";

    public static String optionTwoXpath = "//textarea[@placeholder='Option 2*']";

    public static String optionTwoAnswer = "5";

    public static String sChoiceAnswerXpath = "(//div[contains(@class,'mat-radio-container')])[4]";

    public static String otherOptionXpath = "//span[contains(text(),'Other')]";

    public static String saveQuizButtonXpath = "//span[contains(text(),'Save')]";

    public static String findMyQuizXpath = "//mat-panel-title[contains(text(),'sv:quizgit')]";

    public static String previewMyQuizXpath = "//mat-panel-title[contains(text(),'sv:quizgit')]/../../..//span[contains(text(), 'Preview')]";

}

