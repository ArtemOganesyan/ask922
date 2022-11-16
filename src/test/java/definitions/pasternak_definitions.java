package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.pasternak_xpathlib;

import static support.TestContext.getDriver;

public class pasternak_definitions {
    @Given("PVZ open URL {string}")
    public void pvzOpenURL(String url) {
        getDriver().get("http://ask-stage.portnov.com");
    }

    @Given("PVZ login to the app")
    public void iLoginToTheApp() throws InterruptedException {
        getDriver().findElement(By.xpath(pasternak_xpathlib.emailXpath)).sendKeys("thedore@dinomail.ga");
        getDriver().findElement(By.xpath(pasternak_xpathlib.passwordXpath)).sendKeys("Lviv9");
        getDriver().findElement(By.xpath(pasternak_xpathlib.signInXpath)).click();
        Thread.sleep(3000);
    }

    @Then("the PVZ role should be displayed")
    public void theUserRoleShouldBeDisplayed() {
        WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
        System.out.println(roleLabel.getText());
        String role = roleLabel.getText();
        if (role.equals("STUDENT")) {
            System.out.println("Expected role found");
        } else {
            System.out.println("Unexpected role");
        }

    }

    @And("^PVZ wait for element with xpath \"([^\"]*)\" to be present$")
    public void iWaitForElementWithXpathToBePresent(String xpath) {
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
    }

    @Then("^PVZ click on element with xpath \"([^\"]*)\"$")
    public void iClickOnElementWithXpath(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    @And("^PVZ type \"([^\"]*)\" into element with xpath \"([^\"]*)\"$")
    public void iTypeIntoElementWithXpath(String text, String xpath) {
        getDriver().findElement(By.xpath(xpath)).sendKeys(text);
    }

    @Then("^PVZ wait for (\\d+) sec$")
    public void iWaitForSec(int sec) throws Exception{
        Thread.sleep(sec * 1000);
    }

}

