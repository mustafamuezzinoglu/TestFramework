package com.amazon.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class newPageSearch {

    @Given("user is on the new page1")
    public void user_is_on_the_new_page1() {
        System.out.println("new page 1");
    }
    @When("user wait1")
    public void user_wait() {
        System.out.println("wait 1");
    }
    @Then("user is result1")
    public void user_is_result1() {
        System.out.println("result 1");
    }

    @Given("user is on the new page2")
    public void user_is_on_the_new_page2() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user wait2")
    public void user_wait2() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user is result2")
    public void user_is_result2() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
