package definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.adamokovaXpathLib;
import static support.TestContext.getDriver;



public class adamokovaDefinitions {
    @Given("BA login as a student")
    public void baLoginAsAStudent() throws InterruptedException {
        getDriver().get("http://ask-stage.portnov.com");
        getDriver().findElement(By.xpath(adamokovaXpathLib.emailField)).sendKeys("patkinger@gasss.net");
        getDriver().findElement(By.xpath(adamokovaXpathLib.passwordField)).sendKeys("Pat2022");
        getDriver().findElement(By.xpath(adamokovaXpathLib.submitButton)).click();
        Thread.sleep(3000);
        WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
        System.out.println(roleLabel.getText());
        String role = roleLabel.getText();
        if (role.equals("STUDENT")) {
            System.out.println("Expected role found");
        } else {
            System.out.println("Unexpected role");
        }
    }

    @Then("BA click to {string}")
    public void baClickTo(String field) throws InterruptedException {

        if (field.equals("assignments")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.goToAssignments)).click();
            Thread.sleep(3000);
            WebElement baassignments = getDriver().findElement(By.xpath("//body/ac-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/ac-student-assignments-page[1]/mat-card[1]"
            ));
            System.out.println(baassignments.getText());
            if (baassignments.isDisplayed()) {
                System.out.println("Assignments page is verified");
            } else {
                System.out.println("Assignments page is NOT verified");
            }
        } else if (field.equals("grades")) {

            getDriver().findElement(By.xpath(adamokovaXpathLib.goToGrades)).click();
            Thread.sleep(3000);
            WebElement bagrades = getDriver().findElement(By.xpath("//body/ac-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/ac-student-grades-page[1]"
            ));
            System.out.println(bagrades.getText());
            if (bagrades.isDisplayed()) {
                System.out.println("Grades page page is verified");
            } else {
                System.out.println("Grades page is NOT verified");
            }
        } else if (field.equals("submissions")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.goToSubmissions)).click();
            Thread.sleep(3000);
            WebElement basubmissions = getDriver().findElement(By.xpath("//h4[contains(text(),'Submissions')]"));
            System.out.println(basubmissions.getText());
            if (basubmissions.isDisplayed()) {
                System.out.println("Submissions page is verified");
            } else {
                System.out.println("Submissions page is NOT verified");
            }
        } else if (field.equals("teacher assignments")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.goGoToAssignmentsTeacher)).click();
            Thread.sleep(3000);
            WebElement baassignmentsTeacher = getDriver().findElement(By.xpath("//h4[contains(text(),'List of Assignments')]"));
            if (baassignmentsTeacher.isDisplayed()) {
                System.out.println("Teacher Assignments page is verified");
            } else {
                System.out.println("Teacher Assignments page is NOT verified");
            }
        } else if (field.equals("users management")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.goToUsersManagementPage)).click();
            Thread.sleep(3000);
            WebElement baUsersManagement = getDriver().findElement(By.xpath("//body/ac-root[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/main[1]/ac-user-management-page[1]"));
            if (baUsersManagement.isDisplayed()) {
                System.out.println("Users Management Page is verified");
            } else {
                System.out.println("Users Management Page is NOT verified");
            }
        } else if (field.equals("settings")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.goToSettings)).click();
            Thread.sleep(3000);
        }
        else if (field.equals("change your name")){
            getDriver().findElement(By.xpath(adamokovaXpathLib.changeYourNameButton)).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.dialogChangeName)).isDisplayed();
        }
    }
        @Given("BA login as a teacher")
        public void baLoginAsATeacher () throws InterruptedException {
            getDriver().get("http://ask-stage.portnov.com");
            getDriver().findElement(By.xpath(adamokovaXpathLib.emailField)).sendKeys("bella3021743@gmail.com");
            getDriver().findElement(By.xpath(adamokovaXpathLib.passwordField)).sendKeys("12345Abc");
            getDriver().findElement(By.xpath(adamokovaXpathLib.submitButton)).click();
            Thread.sleep(3000);
            WebElement roleLabel = getDriver().findElement(By.xpath("//div[@class='info']//p"));
            System.out.println(roleLabel.getText());
            String role = roleLabel.getText();
            if (role.equals("TEACHER")) {
                System.out.println("Expected role found");
            } else {
                System.out.println("Unexpected role");
            }
        }

    @And("BA type {string} in a {string} field")
    public void baTypeInAField(String string1, String string2) throws InterruptedException {

        if (string1.equals("Pat Kinger") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Pat Kinger");
            getDriver().findElement(By.xpath(adamokovaXpathLib.changeButton)).isEnabled();
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.Pat_Kinger)).isDisplayed();
        } else if (string1.equals("Pat  Kinger") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Pat  Kinger");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
        } else if  (string1.equals("white space(s)") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys(" ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("  ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
        } else if (string1.equals("'Pat Kinger' OR 'Pa' OR 'P' with trailing and leading spaces") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys(" Pat Kinger");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Pat Kinger ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys(" Pat Kinger ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys(" Pa");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Pa ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys(" P");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("P ");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
        } else if (string1.equals("256 characters") && string2.equals("new name")){
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("qwertyuiopqwertyuiopqwertyuiopqwqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq");
            Thread.sleep(3000);
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.characters)).isDisplayed();
            Thread.sleep(3000);
        } else if (string1.equals("Alpha 123") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Alpha 123");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
        } else if (string1.equals("256 characters and 1 space") && string2.equals("new name")) {
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("qw rtyuiopasdfghjklzxcvbnmlkoiuhytgfredswqazsxcfdertyuijhgvbjhgfrtyuhgvcdfredsxhjhgtrfdecvhgtrfghjvbqwertyuiopasdfghjklzxcvbnmlkoiuhytgfredswqazsxcfdertyuijhgvbjhgfrtyuhgvcdfredsxhjhgtrfdecvhgtrfghjvbnbvcxzasdfghjkiuytgfredswedcvfgtrfgtyhjuikjhytgfredcvbhhg");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
            Thread.sleep(3000);
        } else if (string1.equals("A") && string2.equals("new name")){
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("A");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();
        } else if (string1.equals("Adamo") && string2.equals("new name")){
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
            Thread.sleep(3000);
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("Adamo");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.oneWordName)).isDisplayed();
        } else if (string1.equals("ФИО") && string2.equals("new name")){
            getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).sendKeys("ФИО");
            getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
            getDriver().findElement(By.xpath(adamokovaXpathLib.warningAlert)).isDisplayed();

        }

        }



    @Then("BA leaves empty {string} field")
    public void baLeavesEmptyField(String string2) throws InterruptedException {
        string2.equals("new name");
        getDriver().findElement(By.xpath(adamokovaXpathLib.NewNameField)).clear();
        Thread.sleep(3000);
        getDriver().findElement((By.xpath(adamokovaXpathLib.changeButton))).click();
        getDriver().findElement(By.xpath(adamokovaXpathLib.warNameFieldIsReq)).isDisplayed();
    }
}