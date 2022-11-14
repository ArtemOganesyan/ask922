package DDDDefinitions;

import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.ProtsiukCredentials;
import support.ProtsiukXpathLib;
import static support.TestContext.getDriver;

public class ProtsiukDefinitions {
//    @Given("Login as a Teacher \"([^\"]*)\" and \"([^\"]*)\"$")
    @Given("I login as a \"([^\"]*)\"$")
    public void login(String asWho) throws InterruptedException {
        String login = "";
        String password = "";
        System.out.println(asWho + " HERE IS ASWHO");
        switch (asWho){
            case "teacher":
                login= ProtsiukCredentials.teacherEmail;
                password= ProtsiukCredentials.teacherPassword;
                break;
            case "student":
                login=ProtsiukCredentials.studentEmail;
                password=ProtsiukCredentials.studentPassword;
                break;
            default:
                System.out.println("incorrect credential requested");
        }
        getDriver().get("http://ask-stage.portnov.com");
        getDriver().findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(login);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.passwordField_xpathlib)).sendKeys(password);
        getDriver().findElement(By.xpath(ProtsiukXpathLib.loginButton_xpathlib)).click();
        Thread.sleep(1000);
        WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
        System.out.println(roleLabel.getText());
        String role = roleLabel.getText();
    }
}
