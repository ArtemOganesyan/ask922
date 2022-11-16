package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.trafimukXpathLib;

import static support.TestContext.getDriver;

public class trafimukDefinitions {
    @Given("NT navigate to the login page")
    public void ntNavigateToTheLoginPage() {
        getDriver().get(trafimukXpathLib.url);
    }

    @Then("NT fill out {string} text field")
    public void ntFillOutTextField(String textField) throws InterruptedException {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath(trafimukXpathLib.emailField)).sendKeys(trafimukXpathLib.email);
                break;
            case "Password":
                getDriver().findElement(By.xpath(trafimukXpathLib.passwordField)).sendKeys(trafimukXpathLib.psw);
                break;
            case "Quiz Title":
                Thread.sleep(1000);
                getDriver().findElement(By.xpath(trafimukXpathLib.quizTitle)).sendKeys(trafimukXpathLib.quizTitleTxt);
                break;
            case "Question":
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt);
                break;
            default:
                System.out.println("Please add a valid string");
        }
    }

    @Then("NT click {string} button")
    public void ntClickButton(String button) throws InterruptedException {
        switch (button) {
            case "Sign In":
                getDriver().findElement(By.xpath(trafimukXpathLib.signInButton)).click();
                Thread.sleep(3000);
                WebElement roleLbl = getDriver().findElement(By.xpath(trafimukXpathLib.roleLbl));
                System.out.println(roleLbl.getText());
                String role = roleLbl.getText();
                if (role.equals("TEACHER")) {
                    System.out.println("Expected role found");
                } else {
                    System.out.println("Unexpected role");
                }
                break;
            case "Create New Quiz":
                Thread.sleep(3000);
                getDriver().findElement(By.xpath(trafimukXpathLib.newQuizButton)).click();
                break;
            case "Add Question":
                getDriver().findElement(By.xpath(trafimukXpathLib.addQbutton)).click();
                break;
            default:
                System.out.println("Please add a valid button");
        }
    }

    @Then("NT select {string} from navigation menu")
    public void ntSelectFromNavigationMenu(String menuOption) {
        getDriver().findElement(By.xpath(trafimukXpathLib.menuQuizzes)).click();
    }

    @Then("NT select MC question type")
    public void ntSelectMCQuestionType() {
        getDriver().findElement(By.xpath(trafimukXpathLib.qTypeMC)).click();
    }

    @Then("NT fill out Option {int} text field")
    public void ntFillOutOptionTextField(int option) {
        if (option == 1) {
            getDriver().findElement(By.xpath(trafimukXpathLib.option1Field)).sendKeys(trafimukXpathLib.option1FieldTxt);
        } else if (option == 2) {
            getDriver().findElement(By.xpath(trafimukXpathLib.option2Field)).sendKeys(trafimukXpathLib.option2FieldTxt);
        }
    }

    @Then("NT select checkmark box for Option {int}")
    public void ntSelectCheckmarkBoxForOption(int checkbox) {
        getDriver().findElement(By.xpath(trafimukXpathLib.checkbox1)).click();
    }

    @And("NT save the quiz")
    public void ntSaveTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath(trafimukXpathLib.saveButton)).click();
        Thread.sleep(3000);
    }


    @And("NT fill out {string} text field with {int} char\\(s)")
    public void ntFillOutTextFieldWithCharS(String textField, int charLength) {
        switch (charLength) {
            case 1:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1);
                break;
            case 100:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt100);
                break;
            case 1000:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1000);
                break;
            case 1001:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1001);
                break;
            default:
                System.out.println("Please add a valid int");
        }
    }

    @And("NT click on {string} text field")
    public void ntClickOnTextField(String textField) throws InterruptedException {
        if (textField == "Question") {
            getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).click();
        } else if (textField == "Option 1") {
            getDriver().findElement(By.xpath(trafimukXpathLib.option1Field)).click();
            Thread.sleep(5000);
        }
    }
}
