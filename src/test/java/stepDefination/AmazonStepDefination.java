package stepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.*;
import utilities.ConfigReader;
import utilities.Driver;


public class AmazonStepDefination {
    @Given("istifadeci amazon sehifesine geder")
    public void istifadeci_amazon_sehifesine_geder() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonURL"));

    }
    @When("istifadeci Iphone axtarir")
    public void istifadeci_ıphone_axtarir() {

    }
    @Then("istifadeci neticenin test eder")
    public void istifadeci_neticenin_test_eder() {

    }
    @Then("istifadeci sehifeni baglar")
    public void istifadeci_sehifeni_baglar() {

    }


}
