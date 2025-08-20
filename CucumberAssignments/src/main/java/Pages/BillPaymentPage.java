package Pages;

import Driver.Driver;
import Selectors.BillpaymentSelectors;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BillPaymentPage {
    BillpaymentSelectors selectors;

    public BillPaymentPage() {
        selectors = new BillpaymentSelectors();
    }

    public void enterPayeeName(String payeeName) {
        Driver.getDriver().findElement(selectors.getPayeeNameElement()).sendKeys(payeeName);
    }

    public void enterAddress(String address) {
        Driver.getDriver().findElement(selectors.getPayeeAddressElement()).sendKeys(address);
    }

    public void enterCity(String city) {
        Driver.getDriver().findElement(selectors.getPayeeCityElement()).sendKeys(city);
    }

    public void enterState(String state) {
        Driver.getDriver().findElement(selectors.getPayeeStateElement()).sendKeys(state);
    }

    public void enterZipCode(String zipCode) {
        Driver.getDriver().findElement(selectors.getPayeeZipCodeElement()).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Driver.getDriver().findElement(selectors.getPayeePhoneNumberElement()).sendKeys(phoneNumber);
    }

    public void enterAccountNumber(String accountNumber) {
        Driver.getDriver().findElement(selectors.getAccountElement()).sendKeys(accountNumber);
    }

    public void enterVerifyAccount(String verifyAccount) {
        Driver.getDriver().findElement(selectors.getVerifyAccountElement()).sendKeys(verifyAccount);
    }

    public void enterAmount(String amount) {
        Driver.getDriver().findElement(selectors.getAmountElement()).sendKeys(amount);
    }

    public void clickSendPaymentButton() {
        Driver.getDriver().findElement(selectors.getSendPaymentButtonElement()).click();
    }
    public boolean isSuccess(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(3));
        WebElement element = Driver.getDriver().findElement(selectors.getSuccessPayment());

        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public String successMessage(){
        if(isSuccess()){
            return Driver.getDriver().findElement(selectors.getSuccessPayment()).getText();
        }
        return null;
    }
    public void logoutUser(){
        Driver.getDriver().findElement(selectors.getLogoutElement()).click();
    }
}
