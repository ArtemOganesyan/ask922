package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.trafimuk_xpathlib;

import static support.TestContext.getDriver;

public class ryabchikovaDefinitions {
    @Given("I open url {string}")
    public void iOpenUrl(String string) throws InterruptedException {
        getDriver().get("http://ask-stage.portnov.com");
    }

    @Then("I fill out {string} textfield")
    public void iFillOutTextfield(String textfield) throws InterruptedException {
        getDriver().findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("evgeniya.ryabchikova@icloud.com");
        getDriver().findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("ear053185");

    }

    @And("I click on {string} button")
    public void iClickOnButton(String arg0) {
        
    }

    @Then("I click on {string} from navigation menu")
    public void iClickOnFromNavigationMenu(String arg0) {
        
    }

    @Then("I click on {string} textfield")
    public void iClickOnTextfield(String arg0) {
    }
}
