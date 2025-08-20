package Pages;

import Driver.Driver;
import Selectors.IndexSelectors;

public class IndexPage {
    IndexSelectors selectors;
    public IndexPage(){
        selectors = new IndexSelectors();
    }
    public void clickingRegisterLink(){
        Driver.getDriver().findElement(selectors.getRegisterLinkIndexPageElement()).click();
    }
    public void enterUserName(String userName){
        Driver.getDriver().findElement(selectors.getUserNameInputElement()).sendKeys(userName);
    }
    public void enterPassword(String password){
        Driver.getDriver().findElement(selectors.getPasswordInputElement()).sendKeys(password);
    }
    public void clickLoginButton(){
        Driver.getDriver().findElement(selectors.getLoginButtonElement()).click();
    }
    public void forgotLoginLink(){
        Driver.getDriver().findElement(selectors.getForgotLoginElement()).click();
    }
}