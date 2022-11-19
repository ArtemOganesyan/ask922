package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.butavaXpathLib;
import org.openqa.selenium.WebElement;


import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class butavaDefinitions {
    @Given("SVB opens URL for the ask app")
    public void svbOpensURLForTheAskApp() {
        getDriver().get(butavaXpathLib.askURL);
    }

    @Then("SVB types in {string} field")
    public void svbTypesInField(String textField) throws InterruptedException {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath(butavaXpathLib.emailFieldXpath)).sendKeys(butavaXpathLib.askTEmail);
                break;
            case "Password":
                getDriver().findElement(By.xpath(butavaXpathLib.passFieldXpath)).sendKeys(butavaXpathLib.askTPass);
                break;
            case "Title of the Quiz":
                Thread.sleep(3000);
                getDriver().findElement(By.xpath(butavaXpathLib.myQuizTitleXpath)).sendKeys(butavaXpathLib.quizTitle);
                break;
            case "Question":
                getDriver().findElement(By.xpath(butavaXpathLib.qnXpath)).sendKeys(butavaXpathLib.qn);
                break;
            case "Option 1":
                getDriver().findElement(By.xpath(butavaXpathLib.optionOneXpath)).sendKeys(butavaXpathLib.optionOneAnswer);
                break;
            case "Option 2":
                getDriver().findElement(By.xpath(butavaXpathLib.optionTwoXpath)).sendKeys(butavaXpathLib.optionTwoAnswer);
                break;
            default:
                System.out.println("Check string for textField");

        }
    }

    @And("SVB clicks on {string} button")
    public void svbClicksOnButton(String buttonToClick) throws InterruptedException {
        switch (buttonToClick) {
            case "Sing In":
                getDriver().findElement(By.xpath(butavaXpathLib.singInButtonXpath)).click();
                Thread.sleep(3000);
                WebElement roleLabel = getDriver().findElement(By.xpath(butavaXpathLib.roleXpath));
                System.out.println(roleLabel.getText());
                String role = roleLabel.getText();
                if (role.equals("TEACHER")) {
                    System.out.println("All is good");
                } else {
                    System.out.println("Please use data for Teacher acc");
                }
                break;
            case "Quizzes":
                getDriver().findElement(By.xpath(butavaXpathLib.menuQuizzesXpath)).click();
                break;
            case "Create New Quiz":
                Thread.sleep(3000);
                getDriver().findElement(By.xpath(butavaXpathLib.newQuizButtonXpath)).click();
                new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(butavaXpathLib.myQuizTitleXpath)));
                Thread.sleep(1000);
                break;
            case "Add Question":
                Thread.sleep(1000);
                getDriver().findElement(By.xpath(butavaXpathLib.addQnXpath)).click();
                break;
            case "Save":
                getDriver().findElement(By.xpath(butavaXpathLib.saveQuizButtonXpath)).click();
                break;
            case "My Quiz":
                Thread.sleep(3000);
                getDriver().findElement(By.xpath(butavaXpathLib.findMyQuizXpath)).click();
                break;
            case "Preview":
                getDriver().findElement(By.xpath(butavaXpathLib.previewMyQuizXpath)).click();
                assertThat(getDriver().findElement(By.xpath((butavaXpathLib.otherTextOptionXpath))).isDisplayed()).isTrue();
                break;
            default:
                System.out.println("Check string for buttonToClick");

        }
    }

    @Then("SVB sets {string} element")
    public void svbSetsElement(String elementToSet) throws InterruptedException {
        switch (elementToSet) {
            case "Single-Choice Type":
                Thread.sleep(5000);
                getDriver().findElement(By.xpath(butavaXpathLib.sChoiceTypeXpath)).click();
            case "Option 1":
                getDriver().findElement(By.xpath(butavaXpathLib.sChoiceAnswerXpath)).click();
                break;
            case "Other":
                getDriver().findElement(By.xpath(butavaXpathLib.otherOptionXpath)).click();
                break;
            default:
                System.out.println("Check string for elementToSet");

        }
    }
}


