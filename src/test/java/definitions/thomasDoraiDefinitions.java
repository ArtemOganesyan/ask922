package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import support.thomasDoraiXpathLib;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class thomasDoraiDefinitions
{

    public void JJTDMoveSliderToRight() throws InterruptedException
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 5; i < 10; i++)
        {
            slider.sendKeys(Keys.ARROW_RIGHT);
            Thread.sleep(1000);
            String slider_value = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-slider[1]")).getText();
            String points_value = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-description[1]")).getText();
            assertThat(slider_value).isSubstringOf(points_value);
        }
    }

    public void JJTDMoveSliderToLeft() throws InterruptedException
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        for (int i = 10; i >= 1; i--)
        {
            slider.sendKeys(Keys.ARROW_LEFT);
            Thread.sleep(1000);
            String slider_value = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-slider[1]")).getText();
            String points_value = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-description[1]")).getText();
            assertThat(slider_value).isSubstringOf(points_value);
        }
    }

    public void JJTDSetSliderToPointsToRight(int arg0)
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        //arg0 = 8;
        for (int j = 5; j < arg0; j++) {
            slider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void JJTDSetSliderToPointsToLeft(int arg0)
    {
        WebElement slider = getDriver().findElement(By.xpath("//*[contains(text(),'Q1')]/../../..//mat-slider"));
        //arg0 = 3;
        for (int j = 8; j > arg0; j--) {
            slider.sendKeys(Keys.ARROW_LEFT);
        }
    }

//    public void iClearQuizTitle() throws InterruptedException
//    {
//        getDriver().findElement(By.xpath(joanThomas_XpathLib.deleteQuestionButton)).click();
//        Thread.sleep(2000);
//        getDriver().findElement(By.xpath(joanThomas_XpathLib.confirmationDeleteQuestion)).isDisplayed();
//        getDriver().findElement(By.xpath(joanThomas_XpathLib.deleteQuestion1)).click();
//        Thread.sleep(2000);
//        getDriver().findElement(By.xpath(joanThomas_XpathLib.quizTitleField)).clear();
//        Thread.sleep(2000);
//    }


    @Given("JJTD open registration url")
    public void JjtdOpenRegistrationUrl() throws InterruptedException
    {
        getDriver().get(thomasDoraiXpathLib.registrationUrl);
    }

//    @Then("JJTD clear email field")
//    public void JjtdClearEmailField() throws InterruptedException
//    {
//        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).clear();
//    }

    @Then("JJTD check for valid email address")
    public void JjtdCheckForValidEmailAddress() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("abc.123+test@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        Thread.sleep(5000);
        //Assertion for email error display for valid email address
        boolean b = getDriver().findElement(By.xpath(thomasDoraiXpathLib.validEmailError)).isDisplayed();
        if (b)
        {
            System.out.println("Valid Email Address is not accepted in Email field");
        }
        else
        {
            System.out.println("Valid Email Address is accepted in Email field");
        }
    }


    @Then("JJTD check for invalid email address without top level domain")
    public void JjtdCheckForInvalidEmailAddressWithoutTopLevelDomain() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("abc123@m");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.validEmailError)).isDisplayed();
        Thread.sleep(5000);
        assertThat(getDriver().findElement(By.xpath(thomasDoraiXpathLib.validEmailError)).isDisplayed()).isTrue();
    }


    @Then("JJTD check if email field is required")
    public void JjtdCheckIfEmailFieldIsRequired() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.firstNameField)).sendKeys("ABC");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.lastNameField)).sendKeys("Tester");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).sendKeys("ABC111");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.passwordField)).sendKeys("123abc");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.confirmPasswordField)).sendKeys("123abc");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.registerButton)).click();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.requiredFieldError)).isDisplayed();
        Thread.sleep(5000);
        assertThat(getDriver().findElement(By.xpath(thomasDoraiXpathLib.requiredFieldError)).isDisplayed()).isTrue();
    }

    @Then("JJTD check if whitespaces are allowed in email")
    public void JjtdCheckIfWhitespacesAreAllowedInEmail() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("abc   123@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.validEmailError)).isDisplayed();
        Thread.sleep(5000);
        assertThat(getDriver().findElement(By.xpath(thomasDoraiXpathLib.validEmailError)).isDisplayed()).isTrue();
    }

    @Then("JJTD check if more than maximum characters allowed in full email")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInFullEmail() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccc@gmail.ccccccccccccccccccccoooooooooooooooommmmmmmmmmmmmmmmmmmmmmmm");
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        Thread.sleep(3000);
        String email_value = getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).getAttribute("value");
        Integer email_length = email_value.length();
        Thread.sleep(1000);
        System.out.println("Email Address Length = "+email_length);
        assertThat(email_length).isGreaterThan(128);
        System.out.println("Email field accepts more than maximum characters(128) In Full Email Address");
    }


    @Then("JJTD check if more than maximum characters allowed in local part of email address")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInLocalPartOfEmailAddress() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccccccc@gmail.com");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        Thread.sleep(3000);
        String email_value = getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).getAttribute("value");
        String[] email_split = email_value.split("@");
        String email_local = email_split[0];
        Integer email_locallength = email_local.length();
        Thread.sleep(1000);
        System.out.println("Email Adress Local Part Length = "+email_locallength);
        assertThat(email_locallength).isGreaterThan(64);
        System.out.println("Email field accepts more than maximum characters(63) in Local part of email address");
    }


    @Then("JJTD check if more than maximum characters allowed in domain part of email address")
    public void JjtdCheckIfMoreThanMaximumCharactersAllowedInDomainPartOfEmailAddress() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("aaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccccc@gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggm.cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccoom");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.groupField)).click();
        Thread.sleep(3000);
        String email_value = getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).getAttribute("value");
        String[] email_split = email_value.split("@");
        String email_domain = email_split[1];
        Integer email_domainlength = email_domain.length();
        Thread.sleep(1000);
        System.out.println("Email Address Domain Part Length = "+email_domainlength);
        assertThat(email_domainlength).isGreaterThan(127);
        System.out.println("Email field accepts more than maximum characters(127) in Domain part of email address");
    }


    @Given("JJTD open url and login into Teacher Account")
    public void JjtdOpenUrlAndLoginIntoTeacherAccount() throws InterruptedException
    {
        getDriver().get(thomasDoraiXpathLib.loginUrl);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.emailField)).sendKeys("joanjen.net@gmail.com");
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.passwordField)).sendKeys("teacher85");
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.signInButton)).click();
        Thread.sleep(1000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.roleTeacher)).isDisplayed();
        Thread.sleep(2000);
        assertThat(getDriver().findElement(By.xpath(thomasDoraiXpathLib.roleTeacher)).isDisplayed()).isTrue();
    }

    @And("JJTD create New Quiz with Textual Question")
    public void JjtdCreateNewQuizWithTextualQuestion() throws InterruptedException
    {
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.quizzesMenu)).click();
        Thread.sleep(4000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.listOfQuizzes)).isDisplayed();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.createNewQuizButton)).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.quizTitleField)).isDisplayed();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.quizTitleField)).sendKeys("Testing Types Jo");
        Thread.sleep(2000);
        assertThat(getDriver().findElement(By.xpath(thomasDoraiXpathLib.quizTitleField)).isDisplayed()).isTrue();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.addQuestionButton)).click();
        getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1: new empty question')]")).isDisplayed();
        Thread.sleep(2000);
        assertThat(getDriver().findElement(By.xpath("//mat-panel-title[contains(text(),'Q1: new empty question')]")).isDisplayed()).isTrue();
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.textualRadioButton1)).click();
        Thread.sleep(2000);
        getDriver().findElement(By.xpath(thomasDoraiXpathLib.textAreaField)).sendKeys("Define BlackBox Testing");
        Thread.sleep(3000);
    }


    @Then("JJTD check Textual question points display")
    public void JjtdCheckTextualQuestionPointsDisplay() throws InterruptedException
    {
        //verify whether '5' points is displayed for Question(default)
        getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'5 Point(s)')]")).isDisplayed();
        Thread.sleep(4000);
        assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'5 Point(s)')]")).isDisplayed()).isTrue();
        String points = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'5 Point(s)')]")).getText();
        System.out.println("Textual Question Default Points = "+points);
        assertThat(points).isEqualTo("5 Point(s)");
    }

    @Then("JJTD check if points can be assigned using Slider button")
    public void JjtdCheckIfPointsCanBeAssignedUsingSliderButton() throws InterruptedException
    {
        //Move slider to right
        JJTDMoveSliderToRight();
        Thread.sleep(2000);

        //Move slider to left
        JJTDMoveSliderToLeft();
        Thread.sleep(2000);
    }


    @Then("JJTD verify if points increase or decrease when Points per question slider is increased or decreased")
    public void JjtdVerifyIfPointsIncreaseOrDecreaseWhenPointsPerQuestionSliderIsIncreasedOrDecreased() throws InterruptedException
    {
        //Move slider right to '8' points
        JJTDSetSliderToPointsToRight(8);
        Thread.sleep(3000);
        //verify '8' points is displayed for Question1 and '6 of 8 points' for Passing rate
        getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'8 Point(s)')]")).isDisplayed();
        getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'6 of 8 Points')]")).isDisplayed();
        Thread.sleep(2000);
        //Assertion for textual question points when slider set to 8 points
        assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'8 Point(s)')]")).isDisplayed()).isTrue();
        String points1_assigned = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-description[1]")).getText();
        System.out.println("Textual Question1 Assigned Points1 = "+points1_assigned);
        assertThat(points1_assigned).isEqualTo("8 Point(s)");
        //Assertion for passing rate points when slider set to 8 points
        assertThat(getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'6 of 8 Points')]")).isDisplayed()).isTrue();
        String passrate_points1 = getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5")).getText();
        System.out.println("Textual Question1 Passrate Points1 = "+passrate_points1);
        assertThat(passrate_points1).isEqualTo("6 of 8 Points");

        //Move slider left to '3' points
        JJTDSetSliderToPointsToLeft(3);
        Thread.sleep(3000);
        //verify '3' points is displayed for Question1 and '2 of 3 points' for Passing Rate
        getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'3 Point(s)')]")).isDisplayed();
        getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'2 of 3 Points')]")).isDisplayed();
        Thread.sleep(3000);
        //Assertion for textual question points when slider set to 3 points
        assertThat(getDriver().findElement(By.xpath("//mat-expansion-panel[1]//*[contains(text(),'3 Point(s)')]")).isDisplayed()).isTrue();
        String points2_assigned = getDriver().findElement(By.xpath("//mat-expansion-panel[1]//mat-panel-description[1]")).getText();
        System.out.println("Textual Question1 Assigned Points2 = "+points2_assigned);
        assertThat(points2_assigned).isEqualTo("3 Point(s)");
        //Assertion for passing rate points when slider set to 3 points
        assertThat(getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5[contains(text(),'2 of 3 Points')]")).isDisplayed()).isTrue();
        String passrate_points2 = getDriver().findElement(By.xpath("//ac-quiz-passing-percentage[1]/mat-card[1]/h5")).getText();
        System.out.println("Textual Question1 Passrate Points2 = "+passrate_points2);
        assertThat(passrate_points2).isEqualTo("2 of 3 Points");
    }
}


