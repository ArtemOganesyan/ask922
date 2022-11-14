package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import support.thomasDorai_XpathLib;

import static support.TestContext.getDriver;

public class thomasDoraiDefinitions
{

    public void iMoveSliderToLeft()
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 1; i <= 10; i++)
        {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
    }

    public void iMoveSliderToRight()
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 10; i >= 1; i--)
        {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void iSetSliderToPointsToRight(int arg0)
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 1; i < arg0; i++)
        {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void iSetSliderToPointsToLeft(int arg0)
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 8; i > arg0; i--)
        {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
    }


    @Given("JJTD open registration url")
    public void JjtdOpenRegistrationUrl() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
    }


    @Then("JJTD check for valid email address")
    public void JjtdCheckForValidEmailAddress() throws InterruptedException
    {
        //getDriver().get(joanThomas_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("abc.123+test@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        Thread.sleep(5000);
    }


    @Then("JJTD check for invalid email address without top level domain")
    public void JjtdCheckForInvalidEmailAddressWithoutTopLevelDomain() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("abc123@m");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.validEmailError)).isDisplayed();
        Thread.sleep(5000);
    }


    @Then("JJTD check if email field is required")
    public void JjtdCheckIfEmailFieldIsRequired() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.firstNameField)).sendKeys("ABC");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.lastNameField)).sendKeys("Tester");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).sendKeys("ABC111");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.passwordField)).sendKeys("123abc");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.confirmPasswordField)).sendKeys("123abc");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.registerButton)).click();
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.requiredFieldError)).isDisplayed();
        Thread.sleep(5000);
    }

    @Then("JJTD check if whitespaces are allowed in email")
    public void JjtdCheckIfWhitespacesAreAllowedInEmail() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("abc   123@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.validEmailError)).isDisplayed();
        Thread.sleep(5000);
    }

    @Then("JJTD check if more than maximum characters allowed in Full Email")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInFullEmail() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccc@gmail.ccccccccccccccccccccoooooooooooooooommmmmmmmmmmmmmmmmmmmmmmm");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        Thread.sleep(5000);
    }


    @Then("JJTD check if more than Maximum Characters Allowed In Local Part Of Email Address")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInLocalPartOfEmailAddress() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        Thread.sleep(5000);
    }


    @Then("JJTD check if more than Maximum Characters Allowed In Domain part Of Email Address")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInDomainPartOfEmailAddress() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.registrationUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccc@gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggm.cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccoom");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.groupField)).click();
        Thread.sleep(5000);
    }


    @Given("JJTD open url and login into Teacher Account")
    public void JjtdOpenUrlAndLoginIntoTeacherAccount() throws InterruptedException
    {
        getDriver().get(thomasDorai_XpathLib.loginUrl);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.emailField)).sendKeys("joanjen.net@gmail.com");
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.passwordField)).sendKeys("teacher85");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.signInButton)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.roleTeacher)).isDisplayed();
        Thread.sleep(2000);
    }

    @And("JJTD create New Quiz with Textual Question")
    public void JjtdCreateNewQuizWithTextualQuestion() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.quizzesMenu)).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.listOfQuizzes)).isDisplayed();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.createNewQuizButton)).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.quizTitleField)).isDisplayed();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.quizTitleField)).sendKeys("Testing Types Jo");
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.addQuestionButton)).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1: new empty question')]")).isDisplayed();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.textualRadioButton1)).click();
        Thread.sleep(2000);
    }


    @Then("JJTD check Textual question points display")
    public void JjtdCheckTextualQuestionPointsDisplay() throws InterruptedException
    {
        //verify whether '5' points is displayed for Question(default)
        getDriver().findElement(By.xpath("//mat-expansion-panel-header[1][contains(.,'5 Point(s)')]//*[contains(text(),'Q1')]")).isDisplayed();
        getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//span[contains(text(),'5')]")).isDisplayed();
        Thread.sleep(4000);
    }

    @Then("JJTD check if Points can be assigned using Slider button")
    public void JjtdCheckIfPointsCanBeAssignedUsingSliderButton() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDorai_XpathLib.textAreaField)).sendKeys("Define BlackBox Testing");
        Thread.sleep(3000);
        //Move slider to right
        iMoveSliderToRight();
        Thread.sleep(2000);
        //Move slider to left
        iMoveSliderToLeft();
        Thread.sleep(2000);
    }


    @Then("JJTD verify if Points increase or decrease if Points per question slider is increased or decreased")
    public void JjtdVerifyIfPointsIncreaseOrDecreaseIfPointsPerQuestionSliderIsIncreasedOrDecreased() throws InterruptedException
    {
        //Move slider right to '8' points
        iSetSliderToPointsToRight(8);
        Thread.sleep(2000);
        //verify '8' points is displayed for Question and '6 of 8 points' for Passing percentage
        getDriver().findElement(By.xpath("//mat-expansion-panel-header[1][contains(.,'8 Point(s)')]//*[contains(text(),'Q1')]")).isDisplayed();
        getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'6 of 8 Points')]")).isDisplayed();
        //Move slider left to '3' points
        iSetSliderToPointsToLeft(3);
        Thread.sleep(2000);
        //verify '3' points is displayed for Question and '2 of 3 points' for Passing percentage
        getDriver().findElement(By.xpath("//mat-expansion-panel-header[1][contains(.,'3 Point(s)')]//*[contains(text(),'Q1')]")).isDisplayed();
        getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'2 of 3 Points')]")).isDisplayed();
        Thread.sleep(5000);
    }

}