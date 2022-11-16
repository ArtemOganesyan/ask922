package definitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ProtsiukCredentials;
import support.ProtsiukXpathLib;
import support.thomasDorai_XpathLib;

import static java.lang.Thread.sleep;
import static org.assertj.core.api.Assertions.assertThat;
import static support.TestContext.getDriver;

public class protsiukDefinitions {
    @Given("VP login as \"([^\"]*)\" 'teacher' or 'student' or 'newPasswordTeacher'$")
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

    @Given("VP Log Out")
    public void logOut() throws InterruptedException {
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib))).perform();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutButton_xpathLib)).click();
        new WebDriverWait(getDriver(), 10, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)));
        sleep(1000);
        new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib))).perform();
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.lodOutConfirmationButton_xpathLib)).click();
    }

    @Given("VP set \"([^\"]*)\" password 'old or 'new'$")
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

    @Given("VP try to set \"([^\"]*)\"$")
    public void vpTryToSet(String step) throws InterruptedException {
        login("teacher");
        String oldPassword = "";
        String newPassword = "";
        String confirmNewPassword = "";
        String error = "";

        switch (step){
            case "invalid old password":
                oldPassword = ProtsiukCredentials.teacherWrongPassword;
                newPassword = ProtsiukCredentials.teacherNewPassword;
                confirmNewPassword = ProtsiukCredentials.teacherNewPassword;
                error = "//snack-bar-container[@role = 'alert']";
                break;
            case "new password 7 char with leading space":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = " 1234567";
                confirmNewPassword = " 1234567";
                error = "//mat-error[contains(text(), 'Whitespaces')]";
                break;
            case "new password 7 char with trailing space":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = "1234567 ";
                confirmNewPassword = "1234567 ";
                error = "//mat-error[contains(text(), 'Whitespaces')]";
                break;
            case "new password with two words with space between words":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = "12345 12345";
                confirmNewPassword = "12345 12345";
                error = "//mat-error[contains(text(), 'Whitespaces')]";
                break;
            case "leave field New Password empty":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = "";
                confirmNewPassword = "";
                error = "//mat-error[contains(text(), 'This field')]";
                break;
            case "set password with less than 5 char":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = "1234";
                confirmNewPassword = "1234";
                error = "//mat-error[contains(text(), 'Too short')]";
                break;
            case "set password with more then 32 char":
                oldPassword = ProtsiukCredentials.teacherPassword;
                int x = 33;
                while (x > 0){
                    newPassword += "1";
                    x--;
                }
                confirmNewPassword = newPassword;
                error = "//mat-error[contains(text(), 'Too long')]";
                break;
            case "try to confirm invalid new password":
                oldPassword = ProtsiukCredentials.teacherPassword;
                newPassword = "123456789";
                confirmNewPassword = "123456";
                error = "//mat-error[contains(text(), 'Entered')]";
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
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).sendKeys(oldPassword);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordNewPasswordField_xpathLib)).sendKeys(newPassword);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmNewPasswordField_xpathLib)).sendKeys(confirmNewPassword);
        sleep(1000);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordPasswordField_xpathLib)).click();
        sleep(1000);

        WebElement w = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib));
        boolean actual = w.isEnabled();
//        isClickable(w);

        if (actual) {
            System.out.println("Clickable");
            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
            sleep(2000);
            new WebDriverWait(getDriver(), 3, 200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
            sleep(1000);
        }
        else {
            System.out.println("Unclickable");
            new  WebDriverWait(getDriver(), 2,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
            sleep(1000);
            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib))).perform();
            sleep(1000);
            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
            sleep(1000);
        }
        logOut();
    }

    public static boolean isClickable(WebElement w)
    {
        try
        {
            WebDriverWait wait = new WebDriverWait(getDriver(), 5);
            wait.until(ExpectedConditions.elementToBeClickable(w));
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }
}

//        WebElement w = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib));
//        boolean actual = w.isEnabled();
//        isClickable(w);

//        if (actual) {
//            System.out.println("Clickable");
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
//            sleep(2000);
//            new  WebDriverWait(getDriver(), 3,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
//            sleep(1000);


            //            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib))).perform();
//            sleep(1000);
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).click();
//            sleep(1000);
//            new  WebDriverWait(getDriver(), 3,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
//            sleep(1000);
//            logOut();
//        }
//        else {
//            System.out.println("UnClickable");


//


//            getDriver().switchTo().defaultContent();
//            getDriver().manage().window().maximize();
//            getDriver().switchTo().frame(getDriver().findElement(By.xpath("//mat-icon[contains(text(), 'power_settings_new')]")));
//            sleep(5000);

//            getDriver().findElement(By.xpath("//mat-dialog-container")).click();
//
//            new Actions(getDriver()).moveToElement(getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib))).perform();
//            sleep(5000);
//
//            String actualText = getDriver().findElement(By.xpath(error)).getText();
//            assertThat(actualText).isEqualTo("Whitespaces are not allowed");
//            new  WebDriverWait(getDriver(), 5,200).until(ExpectedConditions.presenceOfElementLocated(By.xpath(error)));
//            sleep(1000);
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
//
//            WebElement element = getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib));
//            JavascriptExecutor executor = (JavascriptExecutor) getDriver();
//            executor.executeScript("arguments[0].click();", element);
//
//            getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationCancelButton_xpathLib)).click();
//            sleep(1000);
//            logOut();
//            logOut(); getDriver().findElement(By.xpath(ProtsiukXpathLib.changingPasswordConfirmationButton_xpathLib)).isDisplayed() &&




