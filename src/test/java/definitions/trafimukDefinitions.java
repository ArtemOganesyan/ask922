package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.trafimukXpathLib;

import static support.TestContext.getDriver;

// <<<<<<< protsiuk
// public class  trafimukDefinitions {
//     @Given("I navigate to the login page")
//     public void iNavigateToTheLoginPage() {
//         getDriver().get(trafimuk_xpathlib.url);
// =======
// public class trafimukDefinitions {
//     @Given("NT navigate to the login page")
//     public void ntNavigateToTheLoginPage() {
//         getDriver().get(trafimukXpathLib.url);
// >>>>>>> main
    }

    @Then("NT fill out {string} text field")
    public void ntFillOutTextField(String textField) throws InterruptedException {
        switch (textField) {
            case "Email":
                getDriver().findElement(By.xpath(trafimukXpathLib.emailField)).sendKeys("iseebugsandbugs@gmail.com");
                break;
            case "Password":
                getDriver().findElement(By.xpath(trafimukXpathLib.passwordField)).sendKeys("Testing#1");
                break;
            case "Quiz Title":
                Thread.sleep(1000);
                getDriver().findElement(By.xpath(trafimukXpathLib.quizTitle)).sendKeys("GJ Quiz 1");
                break;
            case "Question":
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys("A&1");
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
            getDriver().findElement(By.xpath(trafimukXpathLib.option1Field)).sendKeys("A");
        } else if (option == 2) {
            getDriver().findElement(By.xpath(trafimukXpathLib.option2Field)).sendKeys("A&1");
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
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys("a");
                break;
            case 100:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring w&1");
                break;
            case 1000:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel&1");
                break;
            case 1001:
                getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).sendKeys("A wonderful serenity has taken possession of my entire soul, like these sweet mornings of spring which I enjoy with my whole heart. I am alone, and feel the charm of existence in this spot, which was created for the bliss of souls like mine. I am so happy, my dear friend, so absorbed in the exquisite sense of mere tranquil existence, that I neglect my talents. I should be incapable of drawing a single stroke at the present moment; and yet I feel that I never was a greater artist than now. When, while the lovely valley teems with vapour around me, and the meridian sun strikes the upper surface of the impenetrable foliage of my trees, and but a few stray gleams steal into the inner sanctuary, I throw myself down among the tall grass by the trickling stream; and, as I lie close to the earth, a thousand unknown plants are noticed by me: when I hear the buzz of the little world among the stalks, and grow familiar with the countless indescribable forms of the insects and flies, then I feel &1");
                break;
            default:
                System.out.println("Please add a valid int");
        }
    }

    @And("NT click on {string} text field")
    public void ntClickOnTextField(String textField) {
        if (textField == "Question") {
            getDriver().findElement(By.xpath(trafimukXpathLib.questionField)).click();
        } else if (textField == "Option 1") {
            getDriver().findElement(By.xpath(trafimukXpathLib.option1Field)).click();
        }
    }
}
