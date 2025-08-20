package Pages;

import Driver.Driver;
import Selectors.RegisterPageSelectors;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPage{

    ChromeDriver driver;
    RegisterPageSelectors selectors;

    public RegisterPage(){
        driver = Driver.getDriver();
        selectors = new RegisterPageSelectors();
    }

    public void enterFirstName(String firstName){
        driver.findElement(selectors.getFirstNameElement()).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        driver.findElement(selectors.getLastNameElement()).sendKeys(lastName);
    }

    public void enterAddresElement(String address){
        driver.findElement(selectors.getAddressElement()).sendKeys(address);
    }

    public void enterCity(String city){
        driver.findElement(selectors.getCityElement()).sendKeys(city);
    }

    public void enterState(String state){
        driver.findElement(selectors.getStateElement()).sendKeys(state);
    }

    public void enterZipcode(String zipCode){
        driver.findElement(selectors.getZipCodeElement()).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber){
        driver.findElement(selectors.getPhoneNumberElement()).sendKeys(phoneNumber);
    }

    public void enterSSN(String ssn){
        driver.findElement(selectors.getSsnElement()).sendKeys(ssn);
    }

    public void enterUsername(String userName){
        driver.findElement(selectors.getUsernameElement()).sendKeys(userName);
    }

    public void enterPassword(String password){
        driver.findElement(selectors.getPasswordElement()).sendKeys(password);
    }

    public void reneterPassword(String confirmPassword){
        driver.findElement(selectors.getConfirmPasswordElement()).sendKeys(confirmPassword);
    }

    public void pressRegisterbutton(){
        driver.findElement(selectors.getRegisterButtonElement()).click();
    }
}
