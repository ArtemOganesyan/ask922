package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import support.trafimukXpathLib;

import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class trafimukDefinitions {
    @Given("NT navigate to the login page")
    public void ntNavigateToTheLoginPage() {
        getDriver().get(trafimukXpathLib.url);
        String title = "Assessment";
        assertThat(getDriver().getTitle()).contains(title);
    }

    @Then("NT fill out {string} text field")
    public void ntFillOutTextField(String textField) throws InterruptedException {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath(trafimukXpathLib.emailField)).sendKeys(trafimukXpathLib.email);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errInvalidEmail))).hasSize(0);
                break;
            case "Password":
                getDriver().findElement(By.xpath(trafimukXpathLib.passwordField)).sendKeys(trafimukXpathLib.psw);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqPsw))).hasSize(0);
                break;
            case "Quiz Title":
                getDriver().findElement(By.xpath(trafimukXpathLib.quizTitle)).sendKeys(trafimukXpathLib.quizTitleTxt);
                Thread.sleep(1000);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.addQbutton))).hasSize(1);
                break;
            case "Question":
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt);
                Thread.sleep(1000);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldQ))).hasSize(0);
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
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errAuthFailed))).hasSize(0);
                Thread.sleep(3000);
                String role = getDriver().findElement(By.xpath(trafimukXpathLib.roleLbl)).getText();
                String roleTxt = "TEACHER";
                if (role.equals("TEACHER")) {
                    System.out.println("Expected role found: " + role);
                } else {
                    System.out.println("Unexpected role: " + role);
                }
                assertThat(role).isEqualTo(roleTxt);
                break;
            case "Create New Quiz":
                getDriver().findElement(By.xpath(trafimukXpathLib.newQuizButton)).click();
                Thread.sleep(1000);
                assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.quizTitle)).isDisplayed()).isTrue();
                break;
            case "Add Question":
                getDriver().findElement(By.xpath(trafimukXpathLib.addQbutton)).click();
                assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.q1Card)).isDisplayed()).isTrue();
                Thread.sleep(1000);
                break;
            default:
                System.out.println("Please add a valid button");
        }
    }

    @Then("NT select {string} from navigation menu")
    public void ntSelectFromNavigationMenu(String menuOption) throws InterruptedException {
        getDriver().findElement(By.xpath(trafimukXpathLib.menuQuizzes)).click();
        Thread.sleep(3000);
        assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.listOfQuizzes)).isDisplayed()).isTrue();
    }

    @Then("NT select MC question type")
    public void ntSelectMCQuestionType() {
        getDriver().findElement(By.xpath(trafimukXpathLib.qTypeMC)).click();
        assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).isDisplayed()).isTrue();
    }

    @Then("NT fill out Option {int} text field")
    public void ntFillOutOptionTextField(int option) {
        if (option == 1) {
            getDriver().findElement(By.xpath(trafimukXpathLib.option1Field)).sendKeys(trafimukXpathLib.option1FieldTxt);
            assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldOpt1))).hasSize(0);
        } else if (option == 2) {
            getDriver().findElement(By.xpath(trafimukXpathLib.option2Field)).sendKeys(trafimukXpathLib.option2FieldTxt);
            assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldOpt2))).hasSize(0);
        }
    }

    @Then("NT select checkmark box for Option {int}")
    public void ntSelectCheckmarkBoxForOption(int checkbox) {
        getDriver().findElement(By.xpath(trafimukXpathLib.checkbox1)).click();
        assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errAtLeastOneCorrectAns))).hasSize(0);
    }

    @And("NT save the quiz")
    public void ntSaveTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath(trafimukXpathLib.saveButton)).click();
        assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errQuizNotCompleted))).hasSize(0);
        Thread.sleep(5000);
        assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.listOfQuizzes)).isDisplayed()).isTrue();
    }


    @And("NT fill out {string} text field with {int} char\\(s)")
    public void ntFillOutTextFieldWithCharS(String textField, int charLength) {
        switch (charLength) {
            case 1:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldQ))).hasSize(0);
                break;
            case 100:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt100);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldQ))).hasSize(0);
                break;
            case 1000:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1000);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldQ))).hasSize(0);
                break;
            case 1001:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys(trafimukXpathLib.questionFieldTxt1001);
                System.out.println("Quiz is supposed to fail due to functional specs");
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errReqFieldQ))).hasSize(0);
                assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errLength))).hasSize(1);
                break;
            default:
                System.out.println("Please add a valid int");
        }
    }

    @And("NT cannot save the quiz")
    public void ntCannotSaveTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath(trafimukXpathLib.saveButton)).click();
        assertThat(getDriver().findElements(By.xpath(trafimukXpathLib.errQuizNotCompleted))).hasSize(1);
        Thread.sleep(3000);
        assertThat(getDriver().findElement(By.xpath(trafimukXpathLib.listOfQuizzes)).isDisplayed()).isFalse();
    }
}
