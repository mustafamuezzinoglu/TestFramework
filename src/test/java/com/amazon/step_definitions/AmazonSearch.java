package com.amazon.step_definitions;

import com.amazon.pages.AmazonMain;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class AmazonSearch {

    AmazonMain locators = new AmazonMain();
    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));
    }

    @When("user write anything into the search box")
    public void userWriteAnythingIntoTheSearchBox() {
       locators.searchBox.sendKeys("iphone"+ Keys.ENTER);
       locators.searchButton.click();
    }

    @Then("user is on the target page what written in the search box")
    public void userIsOnTheTargetPageWhatWrittenInTheSearchBox() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com.tr : iphone");
    }


}
