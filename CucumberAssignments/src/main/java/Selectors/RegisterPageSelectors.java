package Selectors;

import org.openqa.selenium.By;

public class RegisterPageSelectors {
    private final By firstNameElement = By.cssSelector("input[name='customer.firstName']");
    private final By lastNameElement = By.cssSelector("input[name='customer.lastName']");
    private final By addressElement = By.cssSelector("input[name='customer.address.street']");
    private final By cityElement = By.cssSelector("input[name='customer.address.city']");
    private final By stateElement = By.cssSelector("input[name='customer.address.state']");
    private final By zipCodeElement = By.cssSelector("input[name='customer.address.zipCode']");
    private final By phoneNumberElement = By.cssSelector("input[name='customer.phoneNumber']");
    private final By ssnElement = By.cssSelector("input[name='customer.ssn']");
    private final By usernameElement = By.cssSelector("input[name='customer.username']");
    private final By passwordElement = By.cssSelector("input[name='customer.password']");
    private final By confirmPasswordElement = By.cssSelector("input[name='repeatedPassword']");
    private final By registerButtonElement = By.cssSelector("input[value='Register']");

    public By getFirstNameElement() {
        return firstNameElement;
    }

    public By getLastNameElement() {
        return lastNameElement;
    }

    public By getAddressElement() {
        return addressElement;
    }

    public By getCityElement() {
        return cityElement;
    }

    public By getStateElement() {
        return stateElement;
    }

    public By getZipCodeElement() {
        return zipCodeElement;
    }

    public By getPhoneNumberElement() {
        return phoneNumberElement;
    }

    public By getSsnElement() {
        return ssnElement;
    }

    public By getUsernameElement() {
        return usernameElement;
    }

    public By getPasswordElement() {
        return passwordElement;
    }

    public By getConfirmPasswordElement() {
        return confirmPasswordElement;
    }

    public By getRegisterButtonElement() {
        return registerButtonElement;
    }
}
