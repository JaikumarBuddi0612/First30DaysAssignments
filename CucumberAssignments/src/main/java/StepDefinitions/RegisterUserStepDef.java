package StepDefinitions;

import Driver.Driver;
import Pages.IndexPage;
import Pages.RegisterPage;
import Utils.Log;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class RegisterUserStepDef {
    IndexPage indexPage;
    RegisterPage registerPage;
    public RegisterUserStepDef() {
        indexPage = new IndexPage();
        registerPage = new RegisterPage();
    }

    @Given("User is on the Para Bank website")
    public void user_is_on_the_para_bank_website() {
        System.out.println("User is on the Para Bank website");
        Log.info("User is on the Para Bank website");
    }
    @When("User clicks the register link")
    public void user_clicks_the_register_link() {
        indexPage.clickingRegisterLink();
        Log.info("User clicks the register link");
    }
    @When("User is redirected to the registration page")
    public void user_is_redirected_to_the_registration_page() {
        System.out.println(Driver.getDriver().getTitle());
        Log.info("User is redirected to the registration page");
    }
    @When("User enters their first name{string}")
    public void user_enters_their_first_name(String firstName) {
        registerPage.enterFirstName(firstName);
        Log.info("User enters the first name");
    }
    @When("User enters their last name{string}")
    public void user_enters_their_last_name(String lastName) {
        registerPage.enterLastName(lastName);
        Log.info("User enters the last name");
    }
    @When("User enters their address{string}")
    public void user_enters_their_address(String address) {
        registerPage.enterAddresElement(address);
        Log.info("User enters the address element");
    }
    @When("User enters their city{string}")
    public void user_enters_their_city(String city) {
        registerPage.enterCity(city);
        Log.info("User enters the city");
    }
    @When("User enters their state{string}")
    public void user_enters_their_state(String state) {
        registerPage.enterState(state);
        Log.info("User enters the state element");
    }
    @When("User enters their zipcode{string}")
    public void user_enters_their_zipcode(String zipCode) {
        registerPage.enterZipcode(zipCode);
        Log.info("User enters the zipcode element");
    }
    @When("User enters their phone number{string}")
    public void user_enters_their_phone_number(String phoneNumber) {
        registerPage.enterPhoneNumber(phoneNumber);
        Log.info("User enters the phone number");
    }
    @When("User enters their ssn{string}")
    public void user_enters_their_ssn(String ssn) {
        registerPage.enterSSN(ssn);
        Log.info("User enters the ssn");
    }
    @When("User enters their username{string}")
    public void user_enters_their_username(String userName) {
        registerPage.enterUsername(userName);
        Log.info("User enters the user name");
    }
    @When("User enters their password{string}")
    public void user_enters_their_password(String password) {
        registerPage.enterPassword(password);
        Log.info("User enters the password");
    }
    @When("User confirms their password{string}")
    public void user_confirms_their_password(String confirmPassword) {
        registerPage.reneterPassword(confirmPassword);
        Log.info("User confirms the password");
    }
    @When("User clicks the register button")
    public void user_clicks_the_register_button() {
        registerPage.pressRegisterbutton();
        Log.info("User clicks the register button");
    }
    @Then("User is redirected to their profile")
    public void user_is_redirected_to_their_account_page() {
        System.out.println(Driver.getDriver().getTitle());
        Log.info("User is redirected to their profile");
    }
}
