package Selectors;

import org.openqa.selenium.By;

public class BillpaymentSelectors {
    private final By payeeNameElement = By.cssSelector("input[name='payee.name']");
    private final By payeeAddressElement = By.cssSelector("input[name='payee.address.street']");
    private final By payeeCityElement = By.cssSelector("input[name='payee.address.city']");
    private final By payeeStateElement = By.cssSelector("input[name='payee.address.state']");
    private final By payeeZipCodeElement = By.cssSelector("input[name='payee.address.zipCode']");
    private final By payeePhoneNumberElement = By.cssSelector("input[name='payee.phoneNumber']");
    private final By accountElement = By.cssSelector("input[name='payee.accountNumber']");
    private final By verifyAccountElement = By.cssSelector("input[name='verifyAccount']");
    private final By amountElement = By.cssSelector("input[name='amount']");
    private final By sendPaymentButtonElement = By.cssSelector("input[value='Send Payment']");
    private final By successPayment = By.cssSelector("div#billpayResult");
    private final By logoutElement = By.linkText("Log Out");

    public By getPayeeNameElement() {
        return payeeNameElement;
    }

    public By getPayeeAddressElement() {
        return payeeAddressElement;
    }

    public By getPayeeCityElement() {
        return payeeCityElement;
    }

    public By getPayeeStateElement() {
        return payeeStateElement;
    }

    public By getPayeeZipCodeElement() {
        return payeeZipCodeElement;
    }

    public By getPayeePhoneNumberElement() {
        return payeePhoneNumberElement;
    }

    public By getAccountElement() {
        return accountElement;
    }

    public By getVerifyAccountElement() {
        return verifyAccountElement;
    }

    public By getAmountElement() {
        return amountElement;
    }

    public By getSendPaymentButtonElement() {
        return sendPaymentButtonElement;
    }

    public By getSuccessPayment() {
        return successPayment;
    }

    public By getLogoutElement() {
        return logoutElement;
    }
}
