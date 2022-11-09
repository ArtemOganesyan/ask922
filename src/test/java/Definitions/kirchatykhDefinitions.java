package Definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.kirchatykhXpathLib;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class kirchatykhDefinitions {

    @Given("I create new quiz {string} {string}")
    public void iCreateNewQuiz(String login, String psswd) throws InterruptedException {
        getDriver().get("http://ask-stage.portnov.com");

        getDriver().
                findElement(By.xpath(kirchatykhXpathLib.emailField)).
                sendKeys(login);

        getDriver().
                findElement(By.xpath(kirchatykhXpathLib.passwordfield)).
                sendKeys(psswd);

        getDriver().findElement(By.xpath(kirchatykhXpathLib.loginButton)).click();

        sleep(1000);

        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(kirchatykhXpathLib.quizzesButton)));
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizzesButton)).click();

        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(kirchatykhXpathLib.createNewQuizButton)));
        getDriver().findElement(By.xpath(kirchatykhXpathLib.createNewQuizButton)).click();

        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(kirchatykhXpathLib.quizTitle)));
    }

    @And("I write {string} into quiz_title positive")
    public void iWriteIntoQuiz_titlePositive(String title) {
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(1);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.addQuestionButton)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.previewButton))).hasSize(1);
    }

    @And("I write blank quizz title")
    public void iWriteBlankQuizzTitle() {
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).click();
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.thisFieldIsRequired))).hasSize(1);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(0);
    }

    @And("I generate 1000 {string} into quiz_title positive")
    public void iGenerateIntoQuiz_titlePositive(String ch) throws InterruptedException {
        String title = "";
        for (int i =0; i<1000; i++) title += ch;
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(1);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.addQuestionButton)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.previewButton))).hasSize(1);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.lengthError))).hasSize(0);
    }

    @And("I generate 1001 {string} into quiz_title negative")
    public void iGenerateIntoQuiz_titleNegative(String ch) {
        String title = "";
        for (int i =0; i<1001; i++) title += ch;
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(0);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.lengthError))).hasSize(1);
    }

    @And("I create quiz title with leading and trailing spaces as {string}")
    public void iCreateQuizTitleWithLeadingAndTrailingSpacesAs(String title) {
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(1);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.addQuestionButton)).click();
        getDriver().findElement(By.xpath(kirchatykhXpathLib.textualChoice)).click();
        getDriver().findElement(By.xpath(kirchatykhXpathLib.textualQuestion)).sendKeys("Quest ?");
        getDriver().findElement(By.xpath(kirchatykhXpathLib.questionSaveButton)).click();
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(kirchatykhXpathLib.createNewQuizButton)));
        assertThat(getDriver().findElements(By.xpath("//mat-expansion-panel[.//*[contains(text()," + title.strip() + ")]]")).size() > 0);
    }
}
