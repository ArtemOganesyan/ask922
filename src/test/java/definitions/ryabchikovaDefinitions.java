package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.ryabchikovaXpathLib;

import static support.TestContext.getDriver;

public class ryabchikovaDefinitions {

    @Given("ER navigate to log in page")
    public void erNavigateToLogInPage() throws InterruptedException {
        getDriver().get("http://ask-stage.portnov.com");
        Thread.sleep(3000);
    }

    @Then("ER fill out {string} textfield")
    public void erFillOutTextfield(String textField) {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys("genyarr2@gmail.com");
                break;
            case "Password":
                getDriver().findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("genyarr2!");
                break;
            default:
                System.out.println("Please, check your code");
        }
    }

    @And("ER click on {string} button")
    public void erClickOnButton(String button) {
        switch (button) {
            case "Sign In":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.signInButton)).click();
                break;
            case "Create New Assignment":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.createAssignment)).click();
                break;
            case "Give Assignment":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.giveAssignment)).click();
                break;

        }
    }

    @Then("ER click on {string} textfield")
    public void erClickOnTextfield(String textfield) {
        switch (textfield) {
            case "Group Filter":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.groupFilter)).click();
                break;
            case "A":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.a)).click();
                break;
            case "Select Quiz to Assign Textfield":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.selectQuiztoAssign)).click();
                break;
            case "QA2 cxx":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.QA2cxx)).click();
                break;
            case "Eva R":
                getDriver().findElement(By.xpath(ryabchikovaXpathLib.evaR)).click();
        }
    }

    @Then("ER click on {string} from navigation menu")
    public void erClickOnFromNavigationMenu(String navigationMenu) {
        getDriver().findElement(By.xpath(ryabchikovaXpathLib.assignments)).click();
    }
}

