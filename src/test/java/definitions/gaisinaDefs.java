package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
//import org.apache.xpath.operations.String;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static support.TestContext.getDriver;

public class gaisinaDefs {
    @Given("GLB open url {string}")
    public void glbOpenUrl(String url) {
        getDriver().get("http://ask-stage.portnov.com/#/login");
    }

    @Then("GLB type {string} into element with xpath {string}")
    public void glbTypeIntoElementWithXpath(String text, String xpath) {
        getDriver().findElement(By.xpath(java.lang.String.valueOf(xpath))).sendKeys((CharSequence) text);
    }

    @And("GLB click on element with xpath {string}")
    public void glbClickOnElementWithXpath(String xpath) {
        getDriver().findElement(By.xpath(java.lang.String.valueOf(xpath))).click();
    }

    @Then("GLB wait for element with xpath {string} to be present")
    public void glbWaitForElementWithXpathToBePresent(String xpath) {
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(java.lang.String.valueOf(xpath))));
    }

    @Then("GLB wait for {int} sec")
    public void glbWaitForSec(int arg0) throws InterruptedException {
        Thread.sleep(3000);
    }
}

