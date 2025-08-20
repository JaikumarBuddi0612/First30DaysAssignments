package StepDefinitions;

import Driver.Driver;
import Pages.IndexPage;
import Pages.LookUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotInfoStep {
    IndexPage indexPage;
    LookUpPage lookUpPage;

    public ForgotInfoStep(){
        indexPage = new IndexPage();
        lookUpPage = new LookUpPage();
    }

    @Given("user is on ParaBank Home page")
    public void user_is_on_para_bank_home_page() {
        System.out.println("user is on ParaBank Home page");
    }
    @When("user press forgot login info")
    public void user_press_forgot_login_info() {
        indexPage.forgotLoginLink();
    }
    @Then("user redirects to lookup page")
    public void user_redirects_to_lookup_page() {
        System.out.println(Driver.getDriver().getTitle());
    }
    @When("User enters their first name {string} on forgot page")
    public void user_enters_their_first_name(String firstName) {
        lookUpPage.enterFirstName(firstName);
    }
    @When("User enters their last name {string} on forgot page")
    public void user_enters_their_last_name(String lastName) {
        lookUpPage.enterLastName(lastName);
    }
    @When("User enters their address {string} on forgot page")
    public void user_enters_their_address(String address) {
        lookUpPage.enterAddress(address);
    }
    @When("User enters their city {string} on forgot page")
    public void user_enters_their_city(String city) {
        lookUpPage.enterCity(city);
    }
    @When("User enters their state {string} on forgot page")
    public void user_enters_their_state(String state) {
        lookUpPage.enterState(state);
    }
    @When("User enters their zipcode {string} on forgot page")
    public void user_enters_their_zipcode(String zipCode) {
        lookUpPage.enterZipCode(zipCode);
    }
    @When("User enters their ssn {string} on forgot page")
    public void user_enters_their_ssn(String ssn) {
        lookUpPage.enterSsn(ssn);
    }
    @When("User clicks on Find My login info button on forgot page")
    public void user_clicks_on_find_my_login_info_button() {
        lookUpPage.clickFindMyLoginInfoButton();
    }
    @Then("User details are displayed on forgot page")
    public void user_details_are_displayed() {
        System.out.println(Driver.getDriver().getTitle());
    }
}
