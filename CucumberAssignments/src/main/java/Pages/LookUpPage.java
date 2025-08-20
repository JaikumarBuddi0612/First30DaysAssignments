package Pages;

import Driver.Driver;
import Selectors.LookupSelectors;
import org.openqa.selenium.By;

public class LookUpPage {
    LookupSelectors lookupSelectors;
    public LookUpPage() {
        lookupSelectors = new LookupSelectors();
    }
    public void enterFirstName(String firstName) {
        Driver.getDriver().findElement(lookupSelectors.getFirstNameLookUpPage()).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        Driver.getDriver().findElement(lookupSelectors.getLastNameLookUpPage()).sendKeys(lastName);
    }
    public void enterAddress(String address) {
        Driver.getDriver().findElement(lookupSelectors.getAddressLookUpPage()).sendKeys(address);
    }
    public void enterCity(String city) {
        Driver.getDriver().findElement(lookupSelectors.getCityLookUpPage()).sendKeys(city);
    }
    public void enterState(String state) {
        Driver.getDriver().findElement(lookupSelectors.getStateLookUpPage()).sendKeys(state);
    }
    public void enterZipCode(String zipCode) {
        Driver.getDriver().findElement(lookupSelectors.getZipCodeLookUpPage()).sendKeys(zipCode);
    }
    public void enterSsn(String ssn) {
        Driver.getDriver().findElement(lookupSelectors.getSsnLookUpPage()).sendKeys(ssn);
    }
    public void clickFindMyLoginInfoButton() {
        Driver.getDriver().findElement(lookupSelectors.getFindMyLoginInfoButton()).click();
    }
}