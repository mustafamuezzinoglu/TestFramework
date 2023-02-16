package com.amazon.step_definitions;

import com.amazon.pages.GmailMain;
import com.amazon.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class Gmail {

    GmailMain pages = new GmailMain();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get("https://mail.google.com/mail/u/0/?tab=rm&ogbl#inbox");
    }

    @When("user click the spam folder")
    public void user_click_the_spam_folder() {
        pages.spamFolder.click();
    }

    @And("user click the delete all button")
    public void user_click_the_deleteAll_button() {
        pages.deleteAll.click();
    }


    @Then("user should see spam folder page")
    public void user_should_see_spam_folder_page() {
        pages.deleteAll.click();
    }
}
