package support;

public class MusinaK_xpathLib {
    public static String UserEmail = "//input[@formcontrolname='email']";
    public static String Password = "//input[@formcontrolname='password']";
    public static String loginButtons = "//button[@type='submit']";
    public static String submissionsButton = "//h5[contains(text(),'Submissions')]";
    public static String ReviewedButton = "//div[@class='mat-tab-label-content'][text()='Reviewed']";
    public static String mkTestReviewButton = "//a[contains(@href,'/#/grade/20483?back=submissions/2')]";
    public static String SubmittedAtblock = "//mat-card[.//*[text()='Submitted At:']]";
    public static String TeacherCommentField = "//mat-card[.//*[contains(text(), 'Question 1 of')]]//textarea";
    public static String saveButtonteacherComment = "//button[.//*[contains(text(),'Save')]]";
    public static String AutomaticallyGraded = "//div[contains(text(),'Automatically Graded')]";
}

