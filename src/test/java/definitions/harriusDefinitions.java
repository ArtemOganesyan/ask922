package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.HarriusLib;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class harriusDefinitions {
    @Given("I open ask url")
    public void iOpenAskUrl() {
        getDriver().get(HarriusLib.askURL);
    }

    @Then("I type {string} into text field element")
    public void iTypeIntoTextFieldElement(String text) {
        switch (text) {
            case "Email":
                getDriver().findElement(By.xpath(HarriusLib.emailX)).sendKeys(HarriusLib.emailV);
                break;
            case "Password":
                getDriver().findElement(By.xpath(HarriusLib.passwordX)).sendKeys(HarriusLib.passwordV);
                break;
        }
    }

    @Then("I click on {string} button element")
    public void iClickOnButtonElement(String button) {
        switch (button) {
            case "Sign In":
                getDriver().findElement(By.xpath(HarriusLib.signInButtonX)).click();
                break;
            case "My Assignments":
                getDriver().findElement(By.xpath(HarriusLib.myAssignmentsButtonX)).click();
                break;
        }
    }

    @Then("I wait for element {string} to be present")
    public void iWaitForElementToBePresent(String element) throws InterruptedException {
        switch (element) {
            case "STUDENT":
                new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(HarriusLib.roleSudentX)));
                break;
            case "List of my assignments":
                new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(HarriusLib.myAssignmentsH4X)));
                Thread.sleep(1000);
                break;
        }
    }

    @Then("I verify element {string} contain right text")
    public void iVerifyElementContainRightText(String elementName) throws InterruptedException {
        switch (elementName) {
            case "My Assignments":
            String actualText = getDriver().findElement(By.xpath(HarriusLib.myAssignmentsH4X)).getText();
            assertThat(actualText).containsIgnoringCase(HarriusLib.myAssignmentsH4V);
            Thread.sleep(1000);
            break;
        }
    }
}
