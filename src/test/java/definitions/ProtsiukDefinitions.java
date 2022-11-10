package definitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ProtsiukCredentials;
import support.ProtsiukXpathLib;

import static java.lang.Thread.sleep;
import static support.TestContext.getDriver;

public class ProtsiukDefinitions {
    @Given("I login as \"([^\"]*)\" 'teacher' or 'student' or 'newPasswordTeacher'$")
    public void login(String asWho) throws InterruptedException {
        String login = "";
        String password = "";
        switch (asWho){
            case "teacher":
                login= ProtsiukCredentials.teacherEmail;
                password= ProtsiukCredentials.teacherPassword;
                break;
            case "student":
                login=ProtsiukCredentials.studentEmail;
                password=ProtsiukCredentials.studentPassword;
                break;
            case "newPasswordTeacher":
                login= ProtsiukCredentials.teacherEmail;
                password= ProtsiukCredentials.teacherNewPassword;
            default:
                System.out.println("incorrect credential requested");
        }
        getDriver().get(ProtsiukXpathLib.askURL_xpathLib);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.teacherEmailField_xpathlib)).sendKeys(login);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.teacherPasswordField_xpathlib)).sendKeys(password);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.loginButton_xpathlib)).click();
        sleep(1000);
//        WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
//        System.out.println(roleLabel.getText());
//        String role = roleLabel.getText();
    }

    @Given("I Log Out")
    public void LogOut() throws InterruptedException {
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib))).perform();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib)).click();
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)));
        sleep(1000);
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib))).perform();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)).click();
    }

    @Given("I set \"([^\"]*)\" password 'old or 'new'$")
    public void ChangePassword(String pass) throws InterruptedException {
        String password1 = "";
        String password2 = "";
        switch (pass){
            case "old":
                password1 = ProtsiukCredentials.teacherNewPassword;
                password2= ProtsiukCredentials.teacherPassword;
                break;
            case "new":
                password1 = ProtsiukCredentials.teacherPassword;
                password2 = ProtsiukCredentials.teacherNewPassword;
                break;

            default:
                System.out.println("incorrect credential requested");
        }
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)));
        sleep(1000);
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib))).perform();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.settingButton_xpathLib)).click();
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)));
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changeYourPasswordButton_xpathLib)).click();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).sendKeys(password1);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordNewPasswordField_xpathLib)).sendKeys(password2);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmNewPasswordField_xpathLib)).sendKeys(password2);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
        sleep(1000);
    }

}

