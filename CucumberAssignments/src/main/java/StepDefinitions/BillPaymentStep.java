package StepDefinitions;

import Driver.Driver;
import Pages.BillPaymentPage;
import Pages.IndexPage;
import Pages.OverViewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillPaymentStep {
    IndexPage indexPage;
    OverViewPage ovrpg;
    BillPaymentPage bpg;

    public BillPaymentStep(){
        indexPage = new IndexPage();
        ovrpg = new OverViewPage();
        bpg = new BillPaymentPage();
    }

    @Given("the user is on the Home page")
    public void the_user_is_on_the_home_page() {
        System.out.println("Inside the user is on the Home page");
    }

    @When("User enters {string} and {string} login the user")
    public void user_enters_and_login_the_user(String userName, String password) {
        indexPage.enterUserName(userName);
        indexPage.enterPassword(password);
        indexPage.clickLoginButton();
    }

    @When("the user clicks on the Bill Pay link")
    public void the_user_clicks_on_the_bill_pay_link() {
        ovrpg.clickBillPayLink();
    }

    @Then("the user is redirected to the Payment Process page")
    public void the_user_is_redirected_to_the_payment_process_page() {
        System.out.println(Driver.getDriver().getTitle());
    }

    @When("the user enters payee name {string}")
    public void the_user_enters_payee_name(String payeeName) {
        bpg.enterPayeeName(payeeName);
    }

    @When("enters address {string}")
    public void enters_address(String address) {
        bpg.enterAddress(address);
    }

    @When("enters city {string}")
    public void enters_city(String city) {
        bpg.enterCity(city);
    }

    @When("enters state {string}")
    public void enters_state(String state){
        bpg.enterState(state);
    }

    @When("enters zipcode {string}")
    public void enters_zipcode(String zipcode) {
        bpg.enterZipCode(zipcode);
    }

    @When("enters phone number {string}")
    public void enters_phone_number(String phoneNumber) {
        bpg.enterPhoneNumber(phoneNumber);
    }

    @When("enters account number {string}")
    public void enters_account_number(String accountNumber) {
        bpg.enterAccountNumber(accountNumber);
    }

    @When("verifies the account number as {string}")
    public void verifies_the_account_number_as(String accountNumber) {
        bpg.enterVerifyAccount(accountNumber);
    }

    @When("enters amount {string}")
    public void enters_amount(String amount) {
        bpg.enterAmount(amount);
    }

    @When("clicks on the Send Payment button")
    public void clicks_on_the_send_payment_button() {
        bpg.clickSendPaymentButton();
    }

    @Then("the bill payment is successful")
    public void the_bill_payment_is_successful() {
        System.out.println(bpg.isSuccess());
    }

    @Then("the payment logs are printed")
    public void the_payment_logs_are_printed() {
        System.out.println(bpg.successMessage());
        bpg.logoutUser();
        Driver.getDriver().close();
    }
}
