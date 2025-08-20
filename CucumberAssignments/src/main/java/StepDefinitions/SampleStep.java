package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleStep {
    @Given("user is on google.com")
    public void user_is_on_google_com() {
        System.out.println("Inside given");
    }
    @When("user enters something to search")
    public void user_enters_something_to_search() {
        System.out.println("inside when");
    }
    @When("press enter")
    public void press_enter() {
        System.out.println("inside when");
    }
    @Then("user goes to that relevant subject")
    public void user_goes_to_that_relevant_subject() {
        System.out.println("Inside then");
    }
}
