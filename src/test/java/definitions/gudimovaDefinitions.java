package definitions;

import cucumber.api.java.en.Given;

import static support.TestContext.getDriver;

public class gudimovaDefinitions {
//    @Given("OAV open url {string}")
    public void oavOpenUrl(String arg0) {
        getDriver().get("https://google.com");
    }
}
