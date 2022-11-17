/*
 * Created by Artem Oganesyan on 10.11.2022
 */

package definitions;

import cucumber.api.java.en.Given;

import static support.TestContext.getDriver;

public class oganesyanDefinitions {
   @Given("OAV open url {string}")
   public void oavOpenUrl(String arg0) {
       getDriver().get("https://google.com");
   }
}
