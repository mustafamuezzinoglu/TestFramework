package com.amazon.step_definitions;

import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class AmazonSearch {

    @Given("user is on the search page")
    public void userIsOnTheSearchPage() {
        Driver.getDriver().get(ConfigurationReader.keyValue("url"));
    }

    @When("user write anything into the search box")
    public void userWriteAnythingIntoTheSearchBox() {
        Driver.getDriver().findElement(By.id("twotabsearchtextbox")).sendKeys("iphone"+ Keys.ENTER);
    }

    @Then("user is on the target page what written in the search box")
    public void userIsOnTheTargetPageWhatWrittenInTheSearchBox() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Amazon.com : iphone");
    }


}
