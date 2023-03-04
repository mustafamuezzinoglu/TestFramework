package com.amazon.step_definitions;

import com.amazon.pages.LibraryPage;
import com.amazon.utilities.ConfigurationReader;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.io.ObjectInputFilter;

public class LibraryLogin_StepDefinition {


    LibraryPage locators = new LibraryPage();

    @Given("User is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get(ConfigurationReader.keyValue("libraryUrl"));
    }

    @When("user should be able to write username {string}")
    public void user_should_be_able_to_write_username(String string) {
        locators.inputEmail.sendKeys(string);
    }

    @When("User should be able to write password {string}")
    public void user_should_be_able_to_write_password(String string) {
        locators.inputPassword.sendKeys(string);
    }

    @Then("User should be able click login button")
    public void user_should_be_able_click_login_button() {
        locators.signInButton.click();
    }


    @Then("user should be able see the dashboard")
    public void user_should_be_able_see_the_dashboard() {
       Assert.assertFalse(ConfigurationReader.keyValue("libraryUrl").equals(Driver.getDriver().getCurrentUrl()));
    }

}
