package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SampleLogin {

    @Given("user is on {string} page")
    public void user_is_on_home_page() {
        System.out.println("User is on the home page");
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String userName, String password) {
        System.out.println(userName + password);
    }

    @And("Press login button")
    public void press_login_button() {
        System.out.println("Login button pressed");
    }

    @Then("user redirects to user dashboard")
    public void user_redirects_to_user_dashboard() {
        System.out.println("Redirected to dashboard");
    }
}
