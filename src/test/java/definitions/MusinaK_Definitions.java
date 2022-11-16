package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import support.MusinaK_xpathLib;


import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class MusinaK_Definitions {
    @And("MK login to application")
    public void iLoginToApplication() throws InterruptedException {
        getDriver().get("http://ask-stage.portnov.com");
        getDriver().findElement(By.xpath(MusinaK_xpathLib.UserEmail)).sendKeys("mkteacher@test.com");
        getDriver().findElement(By.xpath(MusinaK_xpathLib.Password)).sendKeys("123123Abc");
        getDriver().findElement(By.xpath(MusinaK_xpathLib.loginButtons)).click();
        Thread.sleep(1000);

    }
    @Then("^MK wait for (\\d+) sec$")
    public void MKWaitForSec(int sec) throws Exception {
        Thread.sleep(1000);
    }

    @And("MK go to Submissions - Reviewed")
    public void iGoToSubmissionsReviewed() {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.submissionsButton)).click();
        getDriver().findElement(By.xpath(MusinaK_xpathLib.ReviewedButton)).click();
    }

    @Then("MK find MK test submission and click on Review button")
    public void iFindMKTestSubmissionAndClickOnReviewButton() {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.mkTestReviewButton)).click();
    }

    @Then("MK verify that Review Submission page displayed")
    public void iVerifyThatReviewSubmissionPageDisplayed() {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.SubmittedAtblock)).isDisplayed();
    }

    @Then("MK navigate to the Teacher comment field and type {string} and Save")
    public void iNavigateToTheTeacherCommentFieldAndType(String text) {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.TeacherCommentField)).sendKeys(text);
        getDriver().findElement(By.xpath(MusinaK_xpathLib.saveButtonteacherComment)).click();
    }

    @Then("MK verify that Teacher Comment {string} was saved")
    public void iVerifyThatTeacherCommentWasSaved(String text) {
        String val = getDriver().findElement(By.xpath(MusinaK_xpathLib.TeacherCommentField)).getAttribute("value");
        System.out.println("Entered text is: " + val);
        assertThat(val).isEqualTo(text);

    }

    @Then("MK navigate to the Teacher comment field and clear existing comment")
    public void iClearExistingCommentAndSaveChanges() throws InterruptedException {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.TeacherCommentField)).clear();
    }

    @Then("MK refresh the page")
    public void iRefreshThePage() {
        getDriver().get("http://ask-stage.portnov.com");
        getDriver().navigate().refresh();
    }

    @Then("MK go to Submissions - Automatically Graded")
    public void iGoToSubmissionsAutomaticallyGraded() throws InterruptedException {
        getDriver().findElement(By.xpath(MusinaK_xpathLib.submissionsButton)).click();
        getDriver().findElement(By.xpath(MusinaK_xpathLib.AutomaticallyGraded)).click();
        Thread.sleep(3000);

    }


    @Then("MK choose first graded submission and click , add comment save and find this submission on Reviewed page")
    public void iChooseFirstGradedSubmissionAndClick() throws InterruptedException {

        String time = getDriver().findElement(By.xpath("(//tr)[2]/td[1]")).getText();
        String student = getDriver().findElement(By.xpath("(//tr)[2]/td[3]")).getText();
        String quiz = getDriver().findElement(By.xpath("(//tr)[2]/td[4]")).getText();

        System.out.println(time + " ; " + student + " : " + quiz);
        Thread.sleep(5000);

        getDriver().findElement(By.xpath("(//tr)[2]//span[contains(text(), 'Review')]")).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath(MusinaK_xpathLib.TeacherCommentField)).sendKeys("abc");
        getDriver().findElement(By.xpath(MusinaK_xpathLib.saveButtonteacherComment)).click();
        Thread.sleep(3000);
        getDriver().findElement(By.xpath(MusinaK_xpathLib.ReviewedButton)).click();
        Thread.sleep(3000);

        String my_xpath = String.format("//tr[ .//*[text() = '%s'] and .//*[text() = '%s'] and .//*[text() = '%s']]//span[contains(text(), 'Review')]", time, student, quiz);
        getDriver().findElement(By.xpath(my_xpath)).click();
        Thread.sleep(2000);

    }

    @Then("MK verify that Reviewed Submission replaced to the Reviewed page and comment saved")
    public void iVerifyThatReviewedSubmissionReplacedToTheReviewedPageAndCommentSaved() throws InterruptedException {
        String val = getDriver().findElement(By.xpath(MusinaK_xpathLib.TeacherCommentField)).getAttribute("value");
        System.out.println("Entered text is: " + val);
        assertThat(val).isEqualTo("abc");

    }


}
