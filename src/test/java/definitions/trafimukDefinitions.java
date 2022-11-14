package Definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.trafimuk_xpathlib;

import static support.TestContext.getDriver;

public class  trafimukDefinitions {
    @Given("I navigate to the login page")
    public void iNavigateToTheLoginPage() {
        getDriver().get(trafimuk_xpathlib.url);
    }

    @Then("I fill out {string} text field")
    public void iFillOutTextField(String textField) throws InterruptedException {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath(trafimuk_xpathlib.emailField)).sendKeys("iseebugsandbugs@gmail.com");
                break;
            case "Password":
                getDriver().findElement(By.xpath(trafimuk_xpathlib.passwordField)).sendKeys("Testing#1");
                break;
            case "Quiz Title":
                Thread.sleep(1000);
                getDriver().findElement(By.xpath(trafimuk_xpathlib.quizzTitle)).sendKeys("GJ Quiz 1");
                break;
            case "Question":
                getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).sendKeys("A&1");
                break;
            default:
                System.out.println("Please add a valid string");
        }
    }

    @Then("I click {string} button")
    public void iClickButton(String button) throws InterruptedException {
        switch (button) {
            case "Sign In":
                getDriver().findElement(By.xpath(trafimuk_xpathlib.signInButton)).click();
                Thread.sleep(3000);
                WebElement roleLbl = getDriver().findElement(By.xpath("//div[@class='info']//p"));
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
                getDriver().findElement(By.xpath(trafimuk_xpathlib.newQuizButton)).click();
                break;
            case "Add Question":
                getDriver().findElement(By.xpath(trafimuk_xpathlib.addQbutton)).click();
                break;
            default:
                System.out.println("Please add a valid button");
        }
    }

    @Then("I select {string} from navigation menu")
    public void iSelectFromNavigationMenu(String menuOption) {
        getDriver().findElement(By.xpath(trafimuk_xpathlib.menuQuizzes)).click();
    }

    @Then("I select MC question type")
    public void iSelectMCQuestionType() {
        getDriver().findElement(By.xpath(trafimuk_xpathlib.qTypeMC)).click();
    }

    @Then("I fill out Option {int} text field")
    public void iFillOutOptionTextField(int option) {
        if (option == 1) {
            getDriver().findElement(By.xpath(trafimuk_xpathlib.option1Field)).sendKeys("A");
        } else if (option == 2) {
            getDriver().findElement(By.xpath(trafimuk_xpathlib.option2Field)).sendKeys("A&1");
        }
    }

    @Then("I select checkmark box for Option {int}")
    public void iSelectCheckmarkBoxForOption(int checkbox) {
        getDriver().findElement(By.xpath(trafimuk_xpathlib.checkbox1)).click();
    }

    @And("I save the quiz")
    public void iSaveTheQuiz() throws InterruptedException {
        getDriver().findElement(By.xpath(trafimuk_xpathlib.saveButton)).click();
        Thread.sleep(3000);
    }


    @And("I fill out {string} text field with {int} char\\(s)")
    public void iFillOutTextFieldWithCharS(String textField, int charLength) {
        switch (charLength) {
            case 1:
                getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).sendKeys("a");
                break;
            case 100:
                getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring w&1");
                break;
            case 1000:
                getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel&1");
                break;
            case 1001:
                getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel &1");
                break;
            default:
                System.out.println("Please add a valid int");
    }
}

    @And("I click on {string} text field")
    public void iClickOnTextField(String textField) {
        if (textField == "Question") {
            getDriver().findElement(By.xpath(trafimuk_xpathlib.questionField)).click();
        } else if (textField == "Option 1") {
            getDriver().findElement(By.xpath(trafimuk_xpathlib.option1Field)).click();
        }
    }

    @And("I see {string} message")
    public void iSeeMessage(String error) {
        //Add assertion
    }
}
