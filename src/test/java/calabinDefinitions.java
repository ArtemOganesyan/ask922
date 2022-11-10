import cucumber.api.java.en.Given;

import static support.TestContext.getDriver;

public class calabinDefinitions {
    @Given("VVC opens url {string}")
    public void vvcOpensUrl(String arg0) {
        getDriver().get("https://google.com");
    }
}
