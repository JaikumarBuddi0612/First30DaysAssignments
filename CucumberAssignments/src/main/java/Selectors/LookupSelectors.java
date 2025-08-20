package Selectors;

import org.openqa.selenium.By;

public class LookupSelectors {
    private final By firstNameLookUpPage = By.cssSelector("input[name='firstName']");
    private final By lastNameLookUpPage = By.cssSelector("input[name='lastName']");
    private final By addressLookUpPage = By.cssSelector("input[name='address.street']");
    private final By cityLookUpPage = By.cssSelector("input[name='address.city']");
    private final By stateLookUpPage = By.cssSelector("input[name='address.state']");
    private final By zipCodeLookUpPage = By.cssSelector("input[name='address.zipCode']");
    private final By ssnLookUpPage = By.cssSelector("input[name='ssn']");
    private final By findMyLoginInfoButton = By.cssSelector("input[type='submit']");

    public By getFirstNameLookUpPage() {
        return firstNameLookUpPage;
    }

    public By getLastNameLookUpPage() {
        return lastNameLookUpPage;
    }

    public By getAddressLookUpPage() {
        return addressLookUpPage;
    }

    public By getCityLookUpPage() {
        return cityLookUpPage;
    }

    public By getStateLookUpPage() {
        return stateLookUpPage;
    }

    public By getZipCodeLookUpPage() {
        return zipCodeLookUpPage;
    }

    public By getSsnLookUpPage() {
        return ssnLookUpPage;
    }

    public By getFindMyLoginInfoButton() {
        return findMyLoginInfoButton;
    }
}
