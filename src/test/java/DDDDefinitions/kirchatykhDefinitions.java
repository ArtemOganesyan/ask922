package DDDDefinitions;

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

    @Given("AKV creates new quiz as {string} {string}")
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

    @And("AKV types in {string} into quiz_title positive")
    public void iWriteIntoQuiz_titlePositive(String title) {
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(1);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.addQuestionButton)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.previewButton))).hasSize(1);
    }

    @And("AKV leaves blank quiz_title")
    public void iWriteBlankQuizTitle() {
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).click();
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.thisFieldIsRequired))).hasSize(1);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(0);
    }

    @And("AKV types in 1000 characters into quiz_title positive")
    public void iGenerateIntoQuiz_titlePositive() throws InterruptedException {
        String generator = "q";
        String title = "";
        for (int i =0; i<1000; i++) title += generator;
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(1);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.addQuestionButton)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.previewButton))).hasSize(1);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.lengthError))).hasSize(0);
    }

    @And("AKV types in 1001 characters into quiz_title negative")
    public void iGenerateIntoQuiz_titleNegative() {
        String generator = "q";
        String title = "";
        for (int i =0; i<1001; i++) title += generator;
        getDriver().findElement(By.xpath(kirchatykhXpathLib.quizTitle)).sendKeys(title);
        getDriver().findElement(By.xpath(kirchatykhXpathLib.role)).click();
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.addQuestionButton))).hasSize(0);
        assertThat(getDriver().findElements(By.xpath(kirchatykhXpathLib.lengthError))).hasSize(1);
    }

    @And("AKV creates quiz title with leading and trailing spaces as {string}")
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
